import Items.Spell;
import Players.Mage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MageTest {

    private Mage mage;
    private Spell spell;

    @Before
    public void before() {
        spell = new Spell("Icy Stare", 10);
        mage = new Mage("Anne Robinson", spell);
    }

    @Test
    public void canGetName() {
        assertEquals("Anne Robinson", mage.getName());
    }

    @Test
    public void hasAnItem() {
        assertEquals(spell, mage.getItem());
    }

    @Test
    public void startsWithFullHealth() {
        assertEquals(20, mage.getHitpoints());
    }

    @Test
    public void canDoDamage() {
        assertEquals(10, mage.doDamage());
    }
}
