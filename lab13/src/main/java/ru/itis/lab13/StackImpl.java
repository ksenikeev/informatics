package ru.itis.lab13;

/**
 * Реализация стека с внутренней структурой хранения данных - массив объектов
 *
 * Если мы достигли длины массива, и класть больше некуда - увеличиваем массив ~ в 1.5 раза
 */
public class StackImpl implements IStack {

    private Object[] data;

    private int count = 0;

    private int len = 10;

    public StackImpl() {
        data = new Object[len];
    }

    public Object pop() {
        Object tmp = data[count - 1];
        data[count - 1] = null;
        count--;
       return tmp;
    }

    public void push(Object o) {
        // контролируем длину массива
        if (count + 1 > len ) {
            Object[] tmp = new Object[len + (len / 2)];
            System.arraycopy(data, 0, tmp, 0, count);
            data = tmp;
        }
        data[count++] = o;
    }
}
