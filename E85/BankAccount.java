package E85;

public class BankAccount {
        private String accountNumber;
        private String accountHolder;
        private double balance;

        public BankAccount(String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public String getAccountHolder() {
            return accountHolder;
        }

        public double getBalance() {
            return balance;
        }

        public BankAccount deposit(double amount) {
            double updatedBalance = balance + amount;
            return new BankAccount(accountNumber, accountHolder, updatedBalance);
        }

        public BankAccount withdraw(double amount) {
            double updatedBalance = balance - amount;
            return new BankAccount(accountNumber, accountHolder, updatedBalance);
        }
    }


