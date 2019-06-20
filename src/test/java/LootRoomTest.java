import Items.Weapon;
import Players.Warrior;
import Rooms.LootRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LootRoomTest {

    private Warrior warrior;
    private LootRoom lootRoom;
    private Weapon weapon, weapon2;

    @Before
    public void before() {
        weapon = new Weapon("Weapon of Choicen Record by FatBoySlim", 1);
        warrior = new Warrior("Lorraine Kelly", weapon);
        weapon2 = new Weapon("Weapon 2", 3);
        lootRoom = new LootRoom(warrior, weapon2);
    }

    @Test
    public void hasPlayer() {
        assertEquals(warrior, lootRoom.getPlayer());
    }

    @Test
    public void hasItemInRoom() {
        assertEquals(weapon2, lootRoom.getItem());
    }

    @Test
    public void itemForcedUponPlayer() {
        lootRoom.forcePlayerItemSwap();
        assertEquals(weapon2, warrior.getItem());
    }

}