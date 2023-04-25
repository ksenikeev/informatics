package ru.itis;

public class MainThreadsSinc {

    private static final int SIZE = 400000000;

    // Массив
    long[] array = new long[SIZE];
    // кол-во вычислительных ядер
    int tCount;
    // промежуточные итоги (суммы)
    long summ;
    // размер порции для параллельных вычислений
    int partSize;

    public static void main(String[] args) throws InterruptedException {

        MainThreadsSinc mainThreads = new MainThreadsSinc();
        mainThreads.initialize();

        long time1 = System.nanoTime();
        double s1 = mainThreads.calculateSum();
        long time1_1 = System.nanoTime() - time1;
        System.out.println(s1 + ": " + time1_1);

        long time2 = System.nanoTime();
        double s2 = mainThreads.calculateSumThread();
        long time2_1 = System.nanoTime() - time2;
        System.out.println(s2 + ": " + time2_1);

        System.out.println(((double) time1_1) / time2_1);

    }

    private void initialize() {
        for (int i = 0; i < SIZE; ++i) {
            array[i] = (int) (Math.random() * 10000);
        }
    }

    // Линейный порядок вычисления модуля вектора
    private double calculateSum() {
        long s = 0;
        for (int i = 0; i < SIZE; ++i) {
            s += (array[i] * array[i]);
        }
        return Math.sqrt(s);
    }

    private double calculateSumThread() {

        tCount = Runtime.getRuntime().availableProcessors();

        partSize = SIZE/tCount;

        // создаем массив параллельных потоков
        Thread[] threads = new Thread[tCount];

        for(int k = 0; k < tCount; ++k) {
            threads[k] = new Thread(
                    new PartSumm(array, k)
            );
            threads[k].start();
        }



        for(int k = 0; k < tCount; ++k) {
            try {
                System.out.println("join " + k);
                threads[k].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        return Math.sqrt(summ);
    }

    private class PartSumm implements Runnable {

        long[] array;
        int k;
        public PartSumm(long[] array, int k) {
            this.array = array;
            this.k = k;
        }

        @Override
        public void run() {
            long ts = System.nanoTime();
            System.out.println("run " + k + " " + ts);
            long s = 0;
            int st = k*partSize;
            int se = (k + 1)*partSize;
            for (int i = st; i < se; ++i) {
                s += (array[i] * array[i]);
            }

            addSumm(s);

            long te = System.nanoTime();
            System.out.println("end " + k + " " + te + ", time " + (te-ts));
        }

        public synchronized void addSumm(long s) {
            summ += s;
        }
    }
}
