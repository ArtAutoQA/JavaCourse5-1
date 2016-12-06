package module6.practice;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by citsym on 05.12.16.
 */
public class StringUtils {

    public static void main(String[] args) {
        String line = " TEST test line";
        char  letter = 'E';

        System.out.println(removeLetter2(line, letter).equals(removeLetter(line, letter)));
        System.out.println(removeLetter3(line, letter).equals(removeLetter(line, letter)));
        System.out.println(removeLetter4(line, letter).equals(removeLetter(line, letter)));

//        System.out.println("TEST TEST TEST".equalsIgnoreCase("test test test"));
//        System.out.println("TEST TEST TEST".equals("test test test"));

        System.out.println(Arrays.toString("TEST TEST TEST".split(" ")));

        double doub = new BigDecimal(0.2342423432).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();

        System.out.println(doub);

    }

    public static String removeLetter(String line, char letter){
        String resultLine = "";

        for (char charItem :  line.toCharArray()){
            if (charItem != letter){
                resultLine = resultLine + charItem;
            }
        }

        return resultLine;
    };

    public static String removeLetter2(String line, char letter){
        String resultLine = "";

        for (int i = 0; i < line.length(); i++) {
             if (line.charAt(i) != letter){
                 resultLine = resultLine + line.charAt(i);
             }
        }

        return resultLine;
    };

    public static String removeLetter3(String line, char letter){
        String resultLine = "";

        String[] array = line.split(letter + "");

        for (String s : array) {
            resultLine += s ;
        }

        return resultLine;
    };


    public static String removeLetter4(String line, char letter){

        return line.replaceAll(letter + "", "");
    };

}
