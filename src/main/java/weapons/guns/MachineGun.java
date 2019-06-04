package weapons.guns;

import weapons.Weapon;

public class MachineGun extends Weapon {

    public MachineGun(int attackDamage) {
        super(attackDamage);
    }

    public String attack() {
        return "BangBangBangBangBangBangBang!";
    }
}
