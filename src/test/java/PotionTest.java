import Items.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {


    Potion potion;

    @Before
    public void before() {
        potion = new Potion("Green Herb", 20);
    }


    @Test
    public void canGetHeal() {
        assertEquals(20, potion.getHeal());
    }

    @Test
    public void canGetType() {
        assertEquals("Green Herb", potion.getType());
    }
}
