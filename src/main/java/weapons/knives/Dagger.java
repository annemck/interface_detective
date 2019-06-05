package weapons.knives;


public class Dagger extends Blade {

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
