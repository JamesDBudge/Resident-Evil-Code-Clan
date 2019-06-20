package Players;

import Items.Spell;
import behaviours.IFight;

public class Mage extends Player  {

    private String name;
    private Spell spell;

    public Mage(String name, Spell spell){
        super(name, spell);
    }

    public int doDamage() {
        return spell.getDamage();
    }
}
