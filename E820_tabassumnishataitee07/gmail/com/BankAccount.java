package E820_tabassumnishataitee07.gmail.com;


public class BankAccount {
        private int accountNumber;
        private double balance;
        private static int lastBalance = 5000;
        public static final double OVERDRAFT_FEE = 126.25;
        public BankAccount(){
            lastBalance++;
            accountNumber = lastBalance;
            balance = 0;
        }
        public BankAccount(double initialBalance){
            lastBalance++;
            accountNumber = lastBalance;
            balance = initialBalance;
        }
        public void deposit(double amount){
            balance = balance + amount;
        }
        public void withdraw(double amount){
            if (amount > balance){
                balance = balance = OVERDRAFT_FEE;
            }else {
                balance = balance - amount;
            }
        }

        public double getBalance() {
            return balance;
        }
        public double getAccountNumber(){
            return accountNumber;
        }
    }



