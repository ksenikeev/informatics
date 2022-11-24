package ru.itis.lab12;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setFio("Михаил Сергеевич");
        student.setBirthDate("2000-01-01");
        student.setGender("M");

        student.setYear(2022);
        student.setGroup("11-200");

        HTMLPersonWriter writer
                = new HTMLStudenWriter(student, "student.html");
        writer.print();
    }
}
