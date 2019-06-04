package weapons.guns;

import weapons.Weapon;

public class Revolver extends Weapon {

    public Revolver(int attackDamage) {
        super(attackDamage);
    }

    public String attack() {
        return "Bang bang!";
    }
}
