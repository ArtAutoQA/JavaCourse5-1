package module11.webinar;

import java.io.*;

public class FileReaderExample {

    //does nothing
    void test() {
        int n = 5;
        while (n > 0) {
            if (n == 3) return;
            System.out.println(n);
            n--;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br;
        BufferedWriter bw = null;
        try {
            FileReader fileReader = new FileReader("/Users/andrii/Desktop/test.txt");
            br = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }

        try {
            //String res = "dsdssd" + "sdsdsdsd";

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                if (!line.equals("pop")) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                }
                line = br.readLine();

                //line=+br.readLine();
                //line+='\n'
            }

            String everything = sb.toString();
            System.out.println(everything);

            bw = new BufferedWriter(new FileWriter("/Users/andrii/Desktop/test_end.txt"));
            bw.flush();
            bw.write(everything);
        } catch (IOException e) {
            System.out.println("read failed");
        } finally {
            try {
                if (br != null)
                    br.close();
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                System.out.println("can't close reade");
            }
        }

       /* BufferedWriter bw = new BufferedWriter(new FileWriterExample("/Users/Andrey/Desktop/file.txt"));
        bw.newLine();
        bw.write("BufferedWriter works");
        //bw.append("dddd", 5, 5);
        bw.close();*/
    }
}
