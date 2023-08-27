public class BankAccountRunner {
    public static void main(String[] args) {
        E820_tabassumnishataitee07.gmail.com.BankAccount bankAccount = new E820_tabassumnishataitee07.gmail.com.BankAccount(5000);
        bankAccount.deposit(1000);
        bankAccount.withdraw(500.25);
        System.out.println("Tabassum ");
        System.out.println("Account Number :" + bankAccount.getAccountNumber());
        System.out.println("Balance :" + bankAccount.getBalance());

    }
}
