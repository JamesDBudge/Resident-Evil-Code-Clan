package Rooms;

import Enemies.Enemy;
import Players.Player;

public class FightRoom extends Room {

    private Enemy enemy;

    public FightRoom(Enemy enemy, Player player){
        super(player);
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }
}
