package weapons.knives;

import weapons.Weapon;

public class SwitchBlade extends Weapon implements ICut {

    public SwitchBlade(int damage) {
        super(damage);
    }

    public String attack(){
        return "Stabby stab!";
    }

    public String cut() {
        return "Nasty cut that.";
    }
}
