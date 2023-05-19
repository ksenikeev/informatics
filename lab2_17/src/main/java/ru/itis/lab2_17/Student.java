package ru.itis.lab2_17;

import lombok.Getter;
import lombok.Setter;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class Student implements Serializable {

    public static String info;

    private String name;
    private Groupp group;
    private String institute;
    private transient String secret;
    private Date birthDate;
}
