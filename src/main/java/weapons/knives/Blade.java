package weapons.knives;

import weapons.Weapon;

public abstract class Blade extends Weapon implements ICut{
    public Blade(int attackDamage) {
        super(attackDamage);
    }
}
