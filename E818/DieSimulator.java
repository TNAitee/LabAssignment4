package E818;

public class DieSimulator {
    public static void main(String[] args) {

        Die die1 = new Die(6);
        Die die2 = new Die(9);

        final int TRIES = 10 ;

        System.out.println("first die : ");
        for (int i = 1; i <= TRIES; i ++){
            int output = die1.cast();
            System.out.print(output + " ");
        }
        System.out.println();
        System.out.println("second die : ");
        for (int i = 1; i <= TRIES; i ++){
            int output = die2.cast();
            System.out.print(output + " ");
        }
        System.out.println();
    }
}
