import Items.Weapon;
import Players.Warrior;
import Rooms.HealRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealRoomTest {

    Warrior warrior;
    HealRoom healRoom;
    Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon("Weapon of Choicen Record by FatBoySlim", 1);
        warrior = new Warrior("Lorraine Kelly", weapon);
        healRoom = new HealRoom(warrior);
    }

    @Test
    public void hasPlayer() {
        assertEquals(warrior, healRoom.getPlayer());
    }

    @Test
    public void healsPlayer() {
        warrior.setHitpoints(2);
        healRoom.healPlayer();
        assertEquals(20, warrior.getHitpoints());
    }

}
