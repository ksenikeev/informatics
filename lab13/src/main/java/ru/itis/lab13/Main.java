package ru.itis.lab13;

public class Main {
    public static void main(String[] args) {
        IStack stack = new StackImpl();

        Long start = System.nanoTime();

        for (int i = 0; i < 10000; ++i)
            stack.push(1);

        for (int i = 0; i < 10000; ++i)
            stack.pop();

        Long stop = System.nanoTime();

        System.out.println("Время работы: " + (stop - start));
    }
// 7445948 StackImplList
// 2534548

// 2074956

}
