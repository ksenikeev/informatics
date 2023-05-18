package ru.itis.lab2_16;

import ru.itis.lab2_16.annotations.DefaultValue;

public class TestClass {
    //@LongVal(100)
    public Long id;
    @DefaultValue(value = "DEFAULT 1")
    private String name;

    public TestClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public TestClass() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
