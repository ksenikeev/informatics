package ru.itis.lab2_9;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.*;

public class MainReadImageByURL {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://shelly.kpfu.ru/e-ksu/docs/F1980796675/EZ4B8235___kopiya.JPG?rnd=6119");
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

            int r = connection.getResponseCode();

            System.out.println(r);

            // Берем ссылку на входной поток, через который получаем данные
            InputStream is = connection.getInputStream();

            FileOutputStream fos = new FileOutputStream("abramsky.jpg");

            is.transferTo(fos);

            fos.flush();

            is.close();
            fos.close();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
