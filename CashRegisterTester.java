import E819_Money.CashRegister;
import E819_Money.Coin;

public class CashRegisterTester {
    public static void main(String[] args) {

        final Coin DOLLAR = new Coin(1.00,"Dollar");
        final Coin QUARTER = new Coin(.25,"Quarter");
        final Coin DIME = new Coin(.1,"Dime");
        final Coin NICKEL = new Coin(.5,"Nickel");
        final Coin PENNY = new Coin(.01,"Penny");

        CashRegister cashRegister = new CashRegister();

        cashRegister.recordPurchase(2.19);
        cashRegister.recordPurchase(1.95);
        cashRegister.recordPurchase(10.95);
        cashRegister.recordPurchase(8.70);
        cashRegister.recordPurchase(16.70);

        cashRegister.receivedPayment(30,DOLLAR);
        cashRegister.receivedPayment(24,QUARTER);
        cashRegister.receivedPayment(15,DIME);
        cashRegister.receivedPayment(30,NICKEL);
        cashRegister.receivedPayment(120,PENNY);

        double change = cashRegister.giveChange();
        System.out.printf("Change :$ %.2f " , change);

    }
}
