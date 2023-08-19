package global.goit.edu.hero;

public class BFG {

    private int ammo;
    int damage;
    String name;

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BFG(int ammo, int damage, String name) {
        this.ammo = ammo;
        this.damage = damage;
        this.name = name;
    }

    public BFG(int ammo, int damage) {
        this (ammo, damage, "BFG");
    }

    public BFG(int ammo) {
        this (ammo, 50, "BFG");
    }

    public BFG() {
        this (1000, 50, "BFG");
    }

    @Override
    public String toString() {
        return name + ", ammo: " + ammo + ", damage: " + damage;
    }
}