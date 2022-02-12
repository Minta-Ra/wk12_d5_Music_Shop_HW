package instruments;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Grotrian", 400.00, 950.00, "Chordophone", "Red", "Wood", 2, 88);
    }

    @Test
    public void hasBrand() {
        assertEquals("Grotrian", piano.getBrand());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(400.00, piano.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(950.00, piano.getSellPrice(), 0.0);
    }

    @Test
    public void hasType() {
        assertEquals("Chordophone", piano.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Red", piano.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasNumOfPedals() {
        assertEquals(2, piano.getNumOfPedals());
    }

    @Test
    public void hasNumOfKeys() {
        assertEquals(88, piano.getNumOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Tun tu-run tun", piano.playInstrument());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(550.00, piano.calculateMarkup(), 0.0);
    }

}
