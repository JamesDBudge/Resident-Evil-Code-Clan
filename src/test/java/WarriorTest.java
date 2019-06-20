import Items.Weapon;
import Players.Warrior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    private Warrior warrior;
    private Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon("Bastard Sword", 6);
        warrior = new Warrior("Joe Biden", weapon);
    }

    @Test
    public void canGetName() {
        assertEquals("Joe Biden", warrior.getName());
    }

    @Test
    public void hasAnItem() {
        assertEquals(weapon, warrior.getItem());
    }

    @Test
    public void startsWithFullHealth() {
        assertEquals(20, warrior.getHitpoints());
    }


//    @Test
//    public void doDamage() {
//        assertEquals(6, warrior.doDamage());
//    }
}
