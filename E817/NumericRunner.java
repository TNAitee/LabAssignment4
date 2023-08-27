package E817;

public class NumericRunner {
    public static void main(String[] args) {
        double test1;
        test1 = Numeric.intPower(3,-8);
        double test2;
        test2 = Numeric.intPower(3,3);
        double test3;
        test3 = Numeric.intPower(3,6);

        System.out.println("n:Negative integer = " + test1);
        System.out.println("n:positive even integer = " + test2);
        System.out.println("n:positive odd integer = " + test3);
    }
}
