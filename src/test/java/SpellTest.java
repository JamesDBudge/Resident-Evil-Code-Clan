import Items.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {


    private Spell spell;

    @Before
    public void before() {
        spell = new Spell("Fire Ball", 10);
    }


    @Test
    public void canGetHeal() {
        assertEquals(10, spell.getDamage());
    }

    @Test
    public void canGetType() {
        assertEquals("Fire Ball", spell.getType());
    }
}
