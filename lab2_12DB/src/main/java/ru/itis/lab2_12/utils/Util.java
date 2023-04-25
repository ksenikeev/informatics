package ru.itis.lab2_12.utils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.util.Date;

public class Util {

    public static Date cropTimeInDate(Date date) {
        LocalDate localDate =
                LocalDate.ofInstant(date.toInstant(), ZoneId.systemDefault());
        return Date.from(
                localDate.atStartOfDay(ZoneId.systemDefault())
                        .toInstant());
    }

}
