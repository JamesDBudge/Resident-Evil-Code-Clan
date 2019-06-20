package Rooms;

import Players.Player;

public abstract class Room {

    protected Player player;

    public Room(Player player){
        this.player = player;
    }

    public Player getPlayer(){
        return player;
    }
}
