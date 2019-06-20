package Players;

import Items.Potion;

public class Cleric extends Player{

    private String name;
    private Potion potion;

    public Cleric(String name, Potion potion){
        super(name, potion);
    }
}
