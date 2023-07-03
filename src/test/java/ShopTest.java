import Instruments.*;
import NonInstrument.GuitarPick;
import NonInstrument.NonInstrument;
import NonInstrument.SheetMusic;
import Shop.Shop;
import interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ShopTest {
    Shop shop;
    Guitar guitar;
    Piano piano;
    GuitarPick guitarPick;
    SheetMusic sheetMusic;
    Flute flute;
    ArrayList<ISell> stock;

    @Before
    public void before(){
        piano = new Piano(InstrumentType.KEYBOARD, 1200.40, 1800.40, 88);
        guitar = new Guitar(InstrumentType.STRING, 450.00, 600.00, 6);
        flute = new Flute(InstrumentType.WOODWIND, 20.00, 30.00, 8);
        guitarPick = new GuitarPick("Dunlop", 2.00, 4.00);
        sheetMusic = new SheetMusic("Moonlight Sonata", 7.00, 10.00);
        stock = new ArrayList<>();
        stock.add(piano);
        stock.add(guitar);
        stock.add(flute);
        stock.add(guitarPick);
        stock.add(sheetMusic);
        shop = new Shop(stock);
    }
    @Test
    public void hasStock(){
        assertEquals(stock, shop.getStock());
    }

    @Test
    public void canGetPotentialProfit(){
        assertEquals(765, shop.getPotentialProfit(), 0.00);
    }

}
