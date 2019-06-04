package weapons.knives;

import weapons.Weapon;

public class Dagger extends Weapon implements ICut {

    public Dagger(int attackDamage) {
        super(attackDamage);
    }

    public String attack() {
        return "Stabby stabby!";
    }


    public String cut() {
        return "Ouch! Nasty cut that.";
    }
}
