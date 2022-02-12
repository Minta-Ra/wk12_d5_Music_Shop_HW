package instruments;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("Yamaha", 100.00, 230.00, "Single-reed woodwind instrument", "Yellow", "Brass");
    }

    @Test
    public void hasBrand() {
        assertEquals("Yamaha", saxophone.getBrand());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(100.00, saxophone.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(230.00, saxophone.getSellPrice(), 0.0);
    }

    @Test
    public void hasType() {
        assertEquals("Single-reed woodwind instrument", saxophone.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Yellow", saxophone.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void canPlay() {
        assertEquals("buhoomu-hoooooooom", saxophone.playInstrument());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(130.00, saxophone.calculateMarkup(), 0.0);
    }

}
