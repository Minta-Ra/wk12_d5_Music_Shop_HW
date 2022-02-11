package instruments;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Gibson", 35.50, 75.00, "String instrument", "Brown", "Wood", 6, GuitarType.ACOUSTIC);
    }

    @Test
    public void hasBrand() {
        assertEquals("Gibson", guitar.getBrand());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(35.50, guitar.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(75.00, guitar.getSellPrice(), 0.0);
    }

    @Test
    public void hasType() {
        assertEquals("String instrument", guitar.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasNumOfStrings() {
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void hasGuitarType() {
        assertEquals(GuitarType.ACOUSTIC, guitar.getGuitarType());
    }

    @Test
    public void canPlay() {
        assertEquals("a-woogah woogah", guitar.playInstrument());
    }

//    @Test
//    public void canBeSold() {
//        assertEquals(39.5, instrument.calculateMarkup(), 0.0);
//    }

}
