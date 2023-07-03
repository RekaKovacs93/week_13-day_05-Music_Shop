package Shop;

import Instruments.Instrument;
import NonInstrument.NonInstrument;
import interfaces.ISell;

import java.util.ArrayList;

public class Shop{
    private ArrayList<ISell> stock;
    public Shop(ArrayList<ISell> stock){
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStock(ISell item){
        stock.add(item);
    }
    public void removeInstrument(ISell item){
        stock.remove(item);
    }

    public double getPotentialProfit(){
        return stock
                .stream()
                .map(ISell::calculateMarkUp)
                .reduce(0.00, (sum, num) -> sum += num);
    }

}
