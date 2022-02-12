package partItems;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SaxophoneStandTest {

    SaxophoneStand saxophoneStand;

    @Before
    public void before() {
        saxophoneStand = new SaxophoneStand("Hamilton Stands", 5.00, 25.50, "Steel");
    }

    @Test
    public void hasBrand() {
        assertEquals("Hamilton Stands", saxophoneStand.getBrand());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(5.00, saxophoneStand.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(25.50, saxophoneStand.getSellPrice(), 0.0);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Steel", saxophoneStand.getMaterial());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(20.50, saxophoneStand.calculateMarkup(), 0.0);
    }

}
