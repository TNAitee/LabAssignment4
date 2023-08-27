package E826;

import java.util.Scanner;

public class LoginFormRunner {
    public static void main(String[] args) {

        LoginForm form = new LoginForm("tnaitee_07","until_DARKNESS_CLAIMS_us");
        Scanner in = new Scanner(System.in);

        while (!form.loggedIn()){
            System.out.println("Login form: ");

            System.out.print("Enter Username: ");
            String userName = in.next();
            form.input("Username",userName);

            System.out.print("Enter Password: ");
            String password = in.next();
            form.input("Password",password);

            form.click("Submit");
        }

        System.out.println("Logged in");

    }
}
