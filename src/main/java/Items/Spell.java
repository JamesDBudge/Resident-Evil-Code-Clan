package Items;

public class Spell extends Item {

    private int damage;


    public Spell(String type, int damage) {
        super(type);
        this.damage = damage;

    }

    public int getDamage() {
        return damage;
    }
}
