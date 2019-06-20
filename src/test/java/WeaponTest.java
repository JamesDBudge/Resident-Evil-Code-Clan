import Items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon("Depth Charge", 100);
    }

    @Test
    public void canGetType() {
        assertEquals("Depth Charge", weapon.getType());
    }

    @Test
    public void canGetDamage() {
        assertEquals(100, weapon.getDamage());
    }

}
