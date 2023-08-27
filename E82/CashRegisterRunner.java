package E82;

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

        cashRegister.receivePayment(40,DOLLAR);

        System.out.printf("Total Purchase: $%5.2f\nTotal Payment:  $%5.2f\nTotal Change:   $%5.2f\n",
                cashRegister.getPurchase(), cashRegister.getPayment(), cashRegister.getChange());
        System.out.printf("Number of Dollars: %3d\n", cashRegister.giveChange(DOLLAR));
        System.out.printf("Number of Quarters: %2d\n", cashRegister.giveChange(QUARTER));
        System.out.printf("Number of Dimes: %5d\n", cashRegister.giveChange(DIME));
        System.out.printf("Number of Nickels: %3d\n", cashRegister.giveChange(NICKEL));
        System.out.printf("Number of Pennies: %3d\n", cashRegister.giveChange(PENNY));

    }
}
