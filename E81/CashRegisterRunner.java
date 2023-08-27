package E81;

public class CashRegisterRunner {

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

        cashRegister.receivePayment(20,DOLLAR);
        cashRegister.receivePayment(8,QUARTER);
        cashRegister.receivePayment(15,DIME);
        cashRegister.receivePayment(10,NICKEL);
        cashRegister.receivePayment(40,PENNY);

        double change = cashRegister.giveChange();
        System.out.printf("Total Purchase: $%5.2f" ,change);

    }
}
