package E82;


public class CashRegister {
    private double payment ;
    private double purchase ;

    public CashRegister(){
        purchase = 0;
        payment = 0 ;
    }

    public void recordPurchase(double amount){
        purchase = purchase + amount ;
    }

    public double getPurchase(){
        return purchase;
    }
    public void receivePayment(int coinCount , Coin coinType ){
        payment = payment + coinCount * coinType.getCoinValue();
    }

    public double getPayment(){
        return payment;
    }

    public double getChange(){
        return (payment - purchase);
    }

    public int giveChange(Coin coinType ){
        double coinValue = coinType.getCoinValue();
        double change = payment - purchase;
        int numberOfCoins;

        numberOfCoins = (int) (change / coinValue);

        payment = payment - (coinValue * numberOfCoins);

        if (coinType.getCoinValue() == 0.01)
        {
            numberOfCoins++;
        }

        return numberOfCoins;
    }

}
