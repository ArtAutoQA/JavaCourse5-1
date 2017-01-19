package module10.webinar;

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        System.out.println("Long values is - " + convert("200"));

        System.out.println("Long values is - " + convert("200a"));

    }

    static Long convert(String input) {
        return Long.valueOf(input);
    }
}
