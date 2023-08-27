package E816;

import java.util.Scanner;

public class Input {

    public static int readInt(Scanner in, String prompt, String error, int min, int max) {
        while (true) {
            System.out.println(prompt);
            boolean num = in.hasNextInt();
            if (num) {
                int value = in.nextInt();
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.println(error);
                }
            }

        }

    }
}


