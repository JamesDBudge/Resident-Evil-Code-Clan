import Enemies.Orc;
import Items.Weapon;
import Players.Warrior;
import Rooms.FightRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FightRoomTest {

    Orc orc;
    Warrior warrior;
    FightRoom fightRoom;
    Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon("Weapon of Choicen Record by FatBoySlim", 1);
        orc = new Orc("Nee", 6, 2);
        warrior = new Warrior("Lorraine Kelly", weapon);
        fightRoom = new FightRoom(orc, warrior);
    }

    @Test
    public void hasPlayer() {
        assertEquals(warrior, fightRoom.getPlayer());
    }

    @Test
    public void hasEnemy() {
        assertEquals(orc, fightRoom.getEnemy());
    }
}
