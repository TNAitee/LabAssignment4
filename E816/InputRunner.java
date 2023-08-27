package E816;

import java.util.Scanner;

public class InputRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Input.readInt(scanner, "Enter any integer number : ", "This integer is not in range", 0, 100));

    }
}

