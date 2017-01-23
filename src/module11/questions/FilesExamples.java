package module11.questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by citsym on 23.01.17.
 */
public class FilesExamples {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("/Users/citsym/desktop/google1.html");

        int b;


        while ((b=fileInputStream.read())!=-1){

            System.out.print((char) b);

        }

    }
}
