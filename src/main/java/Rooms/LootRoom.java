package Rooms;

import Items.Item;
import Players.Player;

public class LootRoom extends Room {

    private Item item;

    public LootRoom(Player player, Item item) {
        super(player);
        this.item = item;
    }

    public Item getItem() {
        return item;
    }


    public void forcePlayerItemSwap() {
        player.setItem(this.item);
    }
}
