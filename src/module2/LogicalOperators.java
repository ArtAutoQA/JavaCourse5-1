package module2;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean isActive = true;
        boolean isLoggedIn = false;

        //0 - false ; 1 - true

        // 0 AND 0 = 0
        // 0 AND 1 = 0
        // 1 AND 0 = 0
        // 1 AND 1 = 1

        // 0 OR 0 = 0
        // 0 OR 1 = 1
        // 1 OR 0 = 1
        // 1 OR 1 = 1

        System.out.println(isActive && isLoggedIn);
        System.out.println(isActive || isLoggedIn);

        System.out.println(!isActive);

    }
}
