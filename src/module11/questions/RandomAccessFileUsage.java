package module11.questions;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by citsym on 23.01.17.
 */
public class RandomAccessFileUsage {

    public static final String USERS_CITSYM_DESKTOP = "/Users/citsym/desktop/";

    public static void main(String[] args) throws IOException {

        RandomAccessFile accessFile = new RandomAccessFile(USERS_CITSYM_DESKTOP + "google1.html", "rw");


        readFromToThePosition(accessFile,106, 216);

        accessFile.write("I HAVE DONE IT".getBytes());

        System.out.println();
        readFromToThePosition(accessFile,106, 230);


    }

    private static void readFromToThePosition(RandomAccessFile accessFile, int from, int to) throws IOException {

        accessFile.seek(from);

        int b;

        while ((b=accessFile.read())!=-1){

            System.out.print((char) b);

            if (to == accessFile.getFilePointer()) {
                break;
            }

        }
    }
}
