package ru.itis.lab2_9;

import javax.net.ssl.HttpsURLConnection;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class MainReadHTMLByURL {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://kpfu.ru/Michael.Abramsky");
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

            int r = connection.getResponseCode();

            System.out.println(r);

            // Берем ссылку на входной поток, через который получаем данные
            InputStream is = connection.getInputStream();

            FileOutputStream fos = new FileOutputStream("abramsky.html");

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
