package Rooms;

import Players.Player;

public class HealRoom extends Room {

    public HealRoom(Player player){
        super(player);
    }

    public void healPlayer() {
        player.setHitpoints(20);
    }
}
