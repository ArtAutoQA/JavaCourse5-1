package module3.questions.operations;

/**
 * Created by citsym on 11.11.16.
 */
public class SumOperation implements Operation {


    int var1;
    int var2;

    public SumOperation(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    @Override
    public int calculate() {
        return var1 + var2;
    }
}
