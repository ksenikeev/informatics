package ru.itis.lab13;

public class Main {
    public static void main(String[] args) {


        IStack stack = new StackImpl();

        Long start = System.nanoTime();

        stack.push("1dasdfadfs");
        stack.push("2dasdfadfs");
        stack.push("3dasdfadfs");
        stack.push("4dasdfadfs");
        stack.push("5d5asdfadfs");
        stack.push("6dasdfadfs");
        stack.push("7dasdfadfs");
        stack.push("8dasdfadfs");
        stack.push("9dasdfadfs");
        stack.push("10dasdfadfs");
        stack.push("11dasdfadfs");
        stack.push("12dasdfadfs");

        stack.push(1);
        stack.push(2);

        System.out.println(stack.pop().getClass().getCanonicalName());
        System.out.println(stack.pop().getClass().getCanonicalName());
        System.out.println(stack.pop().getClass().getCanonicalName());
        System.out.println(stack.pop().getClass().getCanonicalName());
        System.out.println(stack.pop().getClass().getCanonicalName());

        Long stop = System.nanoTime();

        System.out.println("Время работы: " + (stop - start));
    }
// 7445948 StackImplList
// 2534548

// 2074956

}
