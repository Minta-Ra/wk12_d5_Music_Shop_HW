package partItems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("GHS Strings", 5.00, 20.00, "Bronze");
    }

    @Test
    public void hasBrand() {
        assertEquals("GHS Strings", guitarStrings.getBrand());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(5.00, guitarStrings.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(20.00, guitarStrings.getSellPrice(), 0.0);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Bronze", guitarStrings.getMaterial());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(15.00, guitarStrings.calculateMarkup(guitarStrings));
    }
}
