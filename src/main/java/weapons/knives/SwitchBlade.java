package weapons.knives;


public class SwitchBlade extends Blade {

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
