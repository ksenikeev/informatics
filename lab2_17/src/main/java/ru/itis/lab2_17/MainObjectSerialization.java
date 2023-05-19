package ru.itis.lab2_17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainObjectSerialization {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Иван");

        Groupp groupp = new Groupp("11-205");
        student.setSecret("Secret");
        student.info = "Васильевич";
        student.setGroup(groupp);

        try (FileOutputStream fos = new FileOutputStream("student.obj");
             ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(student);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(student.getName());


    }
}
