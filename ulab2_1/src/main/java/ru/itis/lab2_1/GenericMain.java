package ru.itis.lab2_1;

public class GenericMain {

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<Integer>();

        stack.push(10);
        stack.push(Integer.valueOf(12));


        Integer str = stack.pop();
        Integer i1 = stack.pop();

        System.out.println(i1);
        System.out.println(str);

    }
}
