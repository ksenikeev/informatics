package ru.itis.lab2_12.utils;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUtils {

    private static Date date;
    private static Date exceptedDate;

    @BeforeClass
    public static void setUpBeforeClass() {
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                    .parse("2023-04-18 10:58:45");

            exceptedDate = new SimpleDateFormat("yyyy-MM-dd")
                    .parse("2023-04-18");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testCropTimeInDate() {
        Assert.assertEquals(exceptedDate,
                Util.cropTimeInDate(date));
    }

}
