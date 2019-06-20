import Enemies.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    Ogre ogre;

    @Before
    public void before() {
        ogre = new Ogre("Sharkboy and Lavagirl", 10, 4);
    }

    @Test
    public void canGetName() {
        assertEquals("Sharkboy and Lavagirl", ogre.getName());
    }

    @Test
    public void canGetDamage() {
        assertEquals(4, ogre.getDamage());
    }

    @Test
    public void canGetHitPoints() {
        assertEquals(10, ogre.getHitPoints());
    }

    @Test
    public void canSetHitpoints() {
        ogre.setHitPoints(6);
        assertEquals(6, ogre.getHitPoints());
    }
}
