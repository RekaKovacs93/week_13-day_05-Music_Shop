package NonInstrument;

import interfaces.ISell;

public class NonInstrument implements ISell {
    private double sellPrice;
    private double buyPrice;
    public NonInstrument(double sellPrice, double buyPrice){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkUp() {
        return sellPrice - buyPrice;
    }
}
