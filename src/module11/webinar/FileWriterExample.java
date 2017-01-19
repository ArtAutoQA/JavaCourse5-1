package module11.webinar;

import java.io.*;

/**
 * Created by andrii on 1/17/17.
 */
public class FileWriterExample {
    public static void main(String[] args) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("filename.txt"), "utf-8"))) {
            writer.write("something");

        } catch (IOException e) {
            //
        }
    }
}
