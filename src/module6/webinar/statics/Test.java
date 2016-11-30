package module6.webinar.statics;

import module6.HW.ArrayUtils;

public class Test {

    private User user;

    //User user1 = new User("Ann", 20);

    public static void main(String[] args) {
        int a = 5;

        User user1 = new User("Ann", 20);
        User user2 = new User("Jack", 50);
        User user3 = new User("Dima", 18);

        user1.setCompanyName("Google");
        user2.setCompanyName("Luxoft");
        user3.setCompanyName("GlobalLogic");
        user1.setCompanyName("Test");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);


        //User.editCompany();
        User.editCompany();

        user2.change();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);



        final String city;



        //static method example
        Channel[] channels = new Channel[5];
        Channel channel1 = new Channel();
        Channel channel2 = new Channel();
        channels[0] = channel1;
        channels[3] = channel2;


    }
}
