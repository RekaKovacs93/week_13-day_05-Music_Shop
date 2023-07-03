package Instruments;


import interfaces.IPlay;
import interfaces.ISell;

public class Piano extends Instrument implements IPlay, ISell {
    private int numberOfKeys;
    public Piano(InstrumentType instrumentType, double buyingPrice, double sellingPrice, int numberOfKeys){
        super(instrumentType, buyingPrice, sellingPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(){
        return "I'm playing a nice melody";
    }

}
