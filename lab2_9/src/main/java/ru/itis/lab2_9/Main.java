package ru.itis.lab2_9;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        InputStream is;
        OutputStream os;

        FileInputStream fis;
        FileOutputStream fos;

        ByteArrayInputStream bis;
        ByteArrayOutputStream bos;

        BufferedInputStream bufIs;

        try {
            InetAddress address = InetAddress.getByName("google.com");
            System.out.println(address);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

    }
}
