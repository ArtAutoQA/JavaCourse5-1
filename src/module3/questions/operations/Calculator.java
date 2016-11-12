package module3.questions.operations;

/**
 * Created by citsym on 11.11.16.
 */
public class Calculator {

    public static void main(String[] args) {

        Operation[] array = new Operation[2];

        Operation op1 = new SumOperation(5, 6);
        Operation op2 = new MultiplyOperation(5,6 );

        array[0] = op1;
        array[1] = op2;


        for (Operation operation : array) {
            System.out.println(operation.calculate());
        }





    }
}
