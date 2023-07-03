package NonInstrument;

import interfaces.ISell;

public class SheetMusic extends NonInstrument {
    private String name;

    public SheetMusic(String name, double buyingPrice, double sellingPrice){
        super(sellingPrice, buyingPrice);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
