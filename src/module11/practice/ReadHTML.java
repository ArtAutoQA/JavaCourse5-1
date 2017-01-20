package module11.practice;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * Created by citsym on 20.01.17.
 */
public class ReadHTML {
    public static void main(String[] args) throws IOException {
        URL url = null;

        try {
            url = new URL("http://google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("/Users/citsym/desktop/google1.txt"), StandardCharsets.UTF_8));

        String line;

        while ((line = bufferedReader.readLine()) != null) {

            line = line.replaceAll("Google", "Yandex").replaceAll("google", "yandex");
            bw.write(line);
            bw.newLine();
            System.out.println(line);

        }
    }
}
