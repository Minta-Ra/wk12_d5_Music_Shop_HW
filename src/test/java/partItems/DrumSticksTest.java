package partItems;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("Gear4music", 5.00, 15.00, "Wood");
    }

    @Test
    public void hasBrand() {
        assertEquals("Gear4music", drumSticks.getBrand());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(5.00, drumSticks.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(15.00, drumSticks.getSellPrice(), 0.0);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", drumSticks.getMaterial());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10.00, drumSticks.calculateMarkup(), 0.0);
    }

}
