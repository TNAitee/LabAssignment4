package E81;

public class CashRegister {

    private double payment ;
    private double purchase ;

    public CashRegister(){
        purchase = 0;
        payment = 0 ;
    }

    public double recordPurchase(double amount){
        purchase = purchase + amount ;
        return purchase;
    }

    public double receivePayment(int coinCount , Coin coinType ){
        payment = payment + coinCount * coinType.getCoinValue();
        return payment;
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
