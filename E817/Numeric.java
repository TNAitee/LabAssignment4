package E817;

public class Numeric {
    public static double intPower(double x, int n){
        if (n > 0 && n % 2 == 0){
           double answer = Math.pow(Math.pow(x, n / 2.0), 2) ;
           return answer;
        }
        else if (n > 0 && n % 2 == 0) {
            double answer = Math.pow(x, n -1) * x ;
            return answer;
        }
        else {
            double answer = (1 / Math.pow(x, -n));
            return answer;
        }
    }
}
