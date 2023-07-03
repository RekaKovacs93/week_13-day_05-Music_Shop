package Instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Flute extends Instrument implements IPlay, ISell {
    private int numberOfHoles;
    public Flute(InstrumentType instrumentType, double buyingPrice, double sellingPrice, int numberOfHoles){
        super(instrumentType, buyingPrice, sellingPrice);
        this.numberOfHoles = numberOfHoles;
    }
    public String play(){
        return "Blow me";
    }

}
