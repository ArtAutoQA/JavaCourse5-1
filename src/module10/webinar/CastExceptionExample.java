package module10.webinar;

public class CastExceptionExample {
    public static void main(String[] args) {
        try {
            System.out.println((User) someMethod());
        } catch (ClassCastException e) {
            //here can be anything you need
            //System.err.println("someMethod returned not user type");
        }
    }


    static Object someMethod() {
        return new Integer(10);
    }
}
