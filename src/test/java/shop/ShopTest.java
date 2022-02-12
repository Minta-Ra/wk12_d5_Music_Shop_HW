package shop;
import instruments.*;
import org.junit.Before;
import org.junit.Test;
import partItems.DrumSticks;
import partItems.GuitarStrings;
import partItems.SaxophoneStand;
import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Guitar guitar2;
    Guitar guitar3;
    Piano piano;
    Piano piano2;
    Saxophone saxophone;
    Trumpet trumpet;
    DrumSticks drumSticks;
    GuitarStrings guitarStrings;
    SaxophoneStand saxophoneStand;

    @Before
    public void before() {
        shop = new Shop("CodeClan music store");
        guitar = new Guitar("Gibson", 35.50, 75.00, "String instrument", "Brown", "Wood", 6, GuitarType.ACOUSTIC);
        guitar2 = new Guitar("Yamaha", 100.50, 250.00, "String instrument", "White", "Wood", 4, GuitarType.BASS);
        guitar3 = new Guitar("Yamaha", 90.50, 250.00, "String instrument", "Yellow", "Wood", 6, GuitarType.ELECTRIC);
        piano = new Piano("Grotrian", 400.00, 950.00, "Chordophone", "Red", "Wood", 2, 88);
        piano2 = new Piano("Grotrian", 400.00, 950.00, "Chordophone", "Red", "Wood", 2, 88);
        saxophone = new Saxophone("Yamaha", 100.00, 230.00, "Single-reed woodwind instrument", "Yellow", "Brass");
        trumpet = new Trumpet("Yamaha", 200.00, 480.50, "Brass instrument", "Dark yellow", "Brass", 3);
        drumSticks = new DrumSticks("Gear4music", 5.00, 15.00, "Wood");
        guitarStrings = new GuitarStrings("GHS Strings", 5.00, 20.00, "Bronze");
        saxophoneStand = new SaxophoneStand("Hamilton Stands", 5.00, 25.50, "Steel");
        shop.addItemToStock(guitar);
        shop.addItemToStock(piano);
        shop.addItemToStock(saxophone);
        shop.addItemToStock(trumpet);
        shop.addItemToStock(drumSticks);
        shop.addItemToStock(guitarStrings);
        shop.addItemToStock(saxophoneStand);
    }

    @Test
    public void shopHasName() {
        assertEquals("CodeClan music store", shop.getName());
    }

    @Test
    public void hasItemsInStock() {
        assertEquals(7, shop.getItemsFromStock().size());
    }

    @Test
    public void shopCanAddItemToStock() {
        shop.addItemToStock(guitar2);
        shop.addItemToStock(guitar3);
        shop.addItemToStock(piano2);
        assertEquals(10, shop.getItemsFromStock().size());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.removeItemFromStock(trumpet);
        shop.removeItemFromStock(guitarStrings);
        assertEquals(5, shop.getItemsFromStock().size());
    }

    @Test
    public void canGetTotalPotentialProfit() {
        assertEquals(1045.50, shop.getTotalPotentialProfit(), 0.0);
    }

}
