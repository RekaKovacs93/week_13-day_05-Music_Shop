package Instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private int numberOfStrings;
    public Guitar(InstrumentType instrumentType, double buyingPrice, double sellingPrice, int numberOfStrings){
        super(instrumentType, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Lalala";
    }

}
