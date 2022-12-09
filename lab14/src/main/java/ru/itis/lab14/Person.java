package ru.itis.lab14;

public class Person implements IComparable {
    private String name;
    private String birthDate;
    private Integer height;

    public Person() {
    }

    public Person(String name, String birthDate, Integer height) {
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
    }

    public int compare(IComparable o) {
        Person p = (Person) o;
        if (p == null) return 1;
        if (this == p) return 0;
        if (this.height == null && p.getHeight() == null) return 0;
        if (this.height == null && p.getHeight() != null) return -1;
        if (this.height != null && p.getHeight() == null) return 1;

        if (this.height == p.getHeight()) {
            return 0;
        } else if (this.height > p.getHeight()) {
            return 1;
        } else {
            return -1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
