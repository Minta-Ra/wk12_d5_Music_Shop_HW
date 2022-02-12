package instruments;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Yamaha", 200.00, 480.50, "Brass instrument", "Dark yellow", "Brass", 3);
    }

    @Test
    public void hasBrand() {
        assertEquals("Yamaha", trumpet.getBrand());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(200.00, trumpet.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(480.50, trumpet.getSellPrice(), 0.0);
    }

    @Test
    public void hasType() {
        assertEquals("Brass instrument", trumpet.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Dark yellow", trumpet.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void hasNumOfValves() {
        assertEquals(3, trumpet.getNumOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("Buuuuup", trumpet.playInstrument());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(280.50, trumpet.calculateMarkup(), 0.0);
    }

}
