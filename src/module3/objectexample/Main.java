package module3.objectexample;

public class Main {
    static String pppp = "pppp";


    public static void main(String[] args) {
        String test = "test";

        testUser();
        testUser1();



        System.out.println(test);
    }


    static void testUser() {
        int a;
        a = 10;

        //декларация
        User user;
        //инициализация
        user = new User();


        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getCompany());

        System.out.println();

        user.speak();
    }

    static void testUser1() {
        User user1 = new User(1001, "Denis", 10, "module1.webinar.Test");
        User user2 = new User(1000, "DenisTest", 10, "module1.webinar.Test");

        System.out.println(user1);

        System.out.println(user1.getName());
        System.out.println(user1.getAge());
        System.out.println(user1.getCompany());

        user1.setName("MyName");
        long userId = user1.getId();


        System.out.println(user1.getName());
    }
}
