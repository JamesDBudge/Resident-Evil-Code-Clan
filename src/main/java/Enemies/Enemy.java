package Enemies;

public abstract class Enemy {

    private int hitPoints;
    private int damage;
    private String name;

    public Enemy(String name, int hitPoints, int damage){
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
