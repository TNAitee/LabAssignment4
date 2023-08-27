package E825;

import java.util.ArrayList;

public class BankAccount {
    private double initialBalance;
    private double balance ;
    private ArrayList<Double>statement ;

    public BankAccount(double initialBalance){
        balance = initialBalance ;
        statement = new ArrayList<>();
    }

    public void deposit(double amount){
        balance = balance + amount ;
        statement.add(amount);
    }

    public void withdraw(double amount){
        balance = balance - amount;
        statement.add(-amount);
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Double> getStatement() {
        return statement;
    }

    public void cleatStatement(){
        statement.clear();
    }
}
