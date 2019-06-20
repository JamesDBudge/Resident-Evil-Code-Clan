import Items.Potion;
import Players.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric;
    private Potion potion;

    @Before
    public void before() {
        potion = new Potion("Bastard Sword", 6);
        cleric = new Cleric("Joe Biden", potion);
    }

    @Test
    public void canGetName() {
        assertEquals("Joe Biden", cleric.getName());
    }

    @Test
    public void hasAnItem() {
        assertEquals(potion, cleric.getItem());
    }

    @Test
    public void startsWithFullHealth() {
        assertEquals(20, cleric.getHitpoints());
    }


}
