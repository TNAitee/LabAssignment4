package E85;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("7777777","Nishat Tabassum " ,5000.0);

        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Initial balance: " + account.getBalance());

        BankAccount accountAfterDeposit = account.deposit(1000.0);
        System.out.println("New balance after deposit: " + accountAfterDeposit.getBalance());

        BankAccount accountAfterWithdraw = accountAfterDeposit.withdraw(700.0);
        System.out.println("Final balance after withdrawal: " + accountAfterWithdraw.getBalance());
    }
}
