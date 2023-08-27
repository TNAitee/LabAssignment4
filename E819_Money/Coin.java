package E819_Money;

public class Coin {
    private double coinValue;
    private String coinName;

    public Coin(double value, String name) {
       coinValue = value;
       coinName = name;
    }

    public double getCoinValue() {
        return coinValue;
    }

    public String getCoinName() {
        return coinName;
    }
    public double setCoinValue(double value) {
        this.coinValue = value;
        return coinValue;
    }

    public String setCoinName(String name) {
        this.coinName = name;
        return coinName;
    }

}
