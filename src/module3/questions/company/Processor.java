package module3.questions.company;

/**
 * Created by citsym on 11.11.16.
 */
public class Processor {

    public static void main(String[] args) {
        Worker w = new Worker();
        Manager m = new Manager();

        Businessman[] team = new Businessman[2];

        team[0] = w;
        team[1] = m;

        makeBusiness(team);

        Friends[] friends = new Friends[2];

        friends[0] = m;
        friends[1] = w;

        communication(friends);


    }

    private static void communication(Friends[] friends) {
        for (Friends friend : friends) {
            friend.drinkBear(friends);
        }
    }

    private static void makeBusiness(Businessman... businessmens) {
        for (Businessman employee : businessmens) {
            employee.goToMeeting(businessmens);
        }
    }
}
