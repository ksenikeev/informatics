package ru.itis;

public class MainThreadsSinc2 {

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

        MainThreadsSinc2 mainThreads = new MainThreadsSinc2();
        mainThreads.initialize();

        mainThreads.calculateSumThread();
    }

    private void initialize() {
        for (int i = 0; i < SIZE; ++i) {
            array[i] = (int) (Math.random() * 10000);
        }
    }

    private void calculateSumThread() {


        tCount = Runtime.getRuntime().availableProcessors();

        Summator summator = new SummatorImpl(tCount);

        partSize = SIZE/tCount;

        // создаем массив параллельных потоков
        Thread[] threads = new Thread[tCount];

        for(int k = 0; k < tCount; ++k) {
            threads[k] = new Thread(
                    new PartSumm(array, k, summator)
            );
            threads[k].start();
        }
    }

    /**
     * Класс решает задачу нахождения части суммы квадратов
     */
    private class PartSumm implements Runnable {

        Summator summator;

        long[] array;
        int k;
        public PartSumm(long[] array, int k, Summator summator) {
            this.array = array;
            this.k = k;
            this.summator = summator;
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

            summator.setSum(s);

            long te = System.nanoTime();
            System.out.println("end " + k + " " + te + ", time " + (te-ts));
        }

    }

    class SummatorImpl implements Summator {

        int countThreads;

        Long summ = 0L;

        int counter = 0;

        public SummatorImpl(int countThreads) {
            this.countThreads = countThreads;
        }

        @Override
        public synchronized void setSum(long sum) {
            summ += sum;
            counter++;
            System.out.println(counter + " " + summ);
            if (counter == countThreads) {
                System.out.println(Math.sqrt(summ));
            }

        }
    }
}
