package people;

import weapons.Weapon;


public class Suspect extends Person {

    private boolean guilty;

    public Suspect(String name, int health, Weapon weapon, boolean guilty) {
        super(name, health, weapon);
        this.guilty = guilty;
    }

    public boolean getGuilt() {
        return guilty;
    }

    public String attack(Detective detective){
        int damage = this.getWeapon().getAttackDamage();
        detective.reduceHealth(damage);
        String noise = this.getWeapon().attack();
        if (detective.getHealth() == 0){
            if (this.guilty){
                return noise + " That's what ya get for being a nosey parker!";
            } else {
                return noise + "Uh oh, I'm gonna be in a lotta trouble.";
            }
        }
        return noise;
    }
}
