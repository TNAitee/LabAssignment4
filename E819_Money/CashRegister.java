package E819_Money;


public class CashRegister {
    private double payment ;
    private double purchase ;

    public CashRegister(){
        purchase = 0;
        payment = 0 ;
    }

    public double recordPurchase(double amount){
        purchase = purchase + amount ;
        return amount;
    }

    public void receivedPayment(int coinCount , Coin coinType ){
        payment = payment + coinCount * coinType.getCoinValue();

    }

    public double getPayment() {
        return payment;
    }

    public double getPurchase() {
        return purchase;
    }

    public double getChange(){
        return (payment - purchase);
    }

    public double giveChange(){
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
