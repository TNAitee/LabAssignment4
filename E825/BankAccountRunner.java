package E825;

public class BankAccountRunner {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(200);

        bankAccount.deposit(100);
        bankAccount.withdraw(50);
        System.out.println("Balace :$" + bankAccount.getBalance());
        System.out.println("Statement :" + bankAccount.getStatement());

        bankAccount.cleatStatement();
        System.out.println("Cleared statement :" + bankAccount.getStatement());

    }
}
