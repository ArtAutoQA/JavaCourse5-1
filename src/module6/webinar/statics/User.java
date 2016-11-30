package module6.webinar.statics;

public class User {
    private String firstName;
    private int age;
    private static String companyName;


    private static final String CITY = "Kiev";
    private static final Integer COUNT = 1000;

    private final int test = 10;


    //static block example
    static {
        System.out.println("code block 1 invoked...");

        companyName = "";

        final String test;
    }

    void init() {
        System.out.println("init invoked...");
    }


    void gender() {
        firstName += "Mr. ";
    }

    //why static is needed - to initialize something
    static void log() {
        System.out.println("Program started");
    }

    /*static String description = "Some text";*/


    //example of static method
    static String editCompany() {
        if (companyName != null && !companyName.equals("GlobalLogic"))
            companyName = "GlobalLogic";

        return companyName;
    }

    public User(String firstName, int age) {
        init();

        System.out.println("contructor invoked...");
        this.firstName = firstName;
        this.age = age;
    }

    public User(String firstName) {
        this.firstName = firstName;
    }

    public static void setCompanyName(String companyName) {
        User.companyName = companyName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    final void change() {
        age = 20;

        //
        //
        //
        //
    }
}
