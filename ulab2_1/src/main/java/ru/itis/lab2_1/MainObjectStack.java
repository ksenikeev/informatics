package ru.itis.lab2_1;

public class MainObjectStack {
    public static void main(String[] args) {
        ObjectStack stack = new ObjectStack();

        stack.push("Infa");
        stack.push(Integer.valueOf(12));


        String str = (String)stack.pop();
        Integer i1 = (Integer)stack.pop();

        System.out.println(i1);
        System.out.println(str);
    }
}
