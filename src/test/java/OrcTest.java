import Enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before() {
        orc = new Orc("Eamon Holmes", 10, 4);
    }

    @Test
    public void canGetName() {
        assertEquals("Eamon Holmes", orc.getName());
    }

    @Test
    public void canGetDamage() {
        assertEquals(4, orc.getDamage());
    }

    @Test
    public void canGetHitPoints() {
        assertEquals(10, orc.getHitPoints());
    }

    @Test
    public void canSetHitpoints() {
        orc.setHitPoints(6);
        assertEquals(6, orc.getHitPoints());
    }
}
