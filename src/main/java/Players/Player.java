package Players;

import Items.Item;
import Items.Weapon;

public abstract class Player {

    private String name;
    private int hitPoints;
    private Item item;

    public Player(String name, Item item) {
        this.name = name;
        this.hitPoints = 20;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public int getHitpoints() {
        return hitPoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitPoints = hitpoints;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
