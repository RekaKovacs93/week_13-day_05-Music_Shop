package Instruments;

import interfaces.ISell;

public class Instrument implements ISell {
    private InstrumentType instrumentType;
    private double buyingPrice;
    private double sellingPrice;
    public Instrument (InstrumentType instrumentType, double buyingPrice, double sellingPrice){
        this.instrumentType = instrumentType;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }


    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
    public double calculateMarkUp(){
        return getSellingPrice()-getBuyingPrice();
    }

}
