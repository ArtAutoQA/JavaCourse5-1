package module4.webinar.enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(FileExtensions.xml);

        FileExtensions[] ar = FileExtensions.values();

        for(FileExtensions el : ar) {
            System.out.println(el);
        }

        FileExtensions fileExtension = FileExtensions.valueOf("xml");

        System.out.println(fileExtension.ordinal());
    }
}
