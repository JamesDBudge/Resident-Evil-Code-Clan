package Items;

public class Potion extends Item {

    private int heal;

    public Potion(String type, int heal) {
        super(type);
        this.heal = heal;
    }

    public int getHeal() {
        return heal;
    }

}
