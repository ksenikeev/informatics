package ru.itis.lab2_17;

import java.io.*;

public class MainObjectDeSerialization {
    public static void main(String[] args) {
        Student student = null;

       try (FileInputStream fis = new FileInputStream("student.obj");
             ObjectInputStream oos = new ObjectInputStream(fis)
        ) {
            student = (Student) oos.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       }

       if (student != null) {
           System.out.println(student.getName());
           System.out.println(student.getSecret());
           System.out.println("info=" + student.info);
           System.out.println(student.getGroup() != null ?
                   student.getGroup().getName() : null);
       }

    }
}
