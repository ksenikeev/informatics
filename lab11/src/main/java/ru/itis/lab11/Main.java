package ru.itis.lab11;

public class Main {
    public static void main(String[] args) {
        TreeMaker tree = new TreeMaker();
        tree.createTree(new int[]{1,2,3,4,5,6,7,8,9});
        tree.printTree();
    }
}
