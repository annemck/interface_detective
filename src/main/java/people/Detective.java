package people;

import weapons.Weapon;

public class Detective extends Person {


    public Detective(String name, int health, Weapon weapon) {
        super(name, health, weapon);
    }

    public String question(Suspect suspect){
        return "Did ya do it " + suspect.getName() + "?";
    }

    public String threaten(Suspect suspect){
        return "You can either lie to me " + suspect.getName() + " or I can kill you, which is it?";
    }

    public String attack(Suspect suspect){
        int damage = this.getWeapon().getAttackDamage();
        suspect.reduceHealth(damage);
        String noise = this.getWeapon().attack();
        if (suspect.getHealth() == 0){
            if (suspect.getGuilt()){
                return noise + " You got what was coming to ya.";
            } else {
                return noise + " Well, this'll be a lotta paperwork.";
            }
        }
        return noise;
    }
}
