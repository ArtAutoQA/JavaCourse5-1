package module2;

public class LoopsExample {
    public static void main(String[] args) {

        //for(initialization of variable; condition; incr/decr)
        for (int test = 4; test < 10; test ++) {
            System.out.println("Varibale test is equal to: " + test);

            /*if(test != 6)
                continue;*/


            System.out.println("test output");

            System.out.println("test output 2");

            break;

            //break;
            //continue;
        }



        //while example
        int whileLoopVar = 5;

        while (whileLoopVar < 10) {
           // System.out.println("cool");

            whileLoopVar++;
        }


        //do-while example
        int t = 10;
        do {
           // System.out.println(t);
            t--;
        } while (t > 5);


        //double for example
        for (int test = 0; test <= 10; test ++) {
            for (int i = 0; i < 5; i++) {
             //   System.out.println("i : " + i + " " + "test : " + test);
            }
        }

    }
}
