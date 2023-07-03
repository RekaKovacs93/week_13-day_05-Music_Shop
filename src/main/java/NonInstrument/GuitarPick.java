package NonInstrument;

import interfaces.ISell;

public class GuitarPick extends NonInstrument {

    private String brand;
    public GuitarPick(String brand, double sellingPrice, double buyingPrice){
        super(buyingPrice, sellingPrice);
        this.brand = brand;


    }

    public String getBrand() {
        return brand;
    }

}
