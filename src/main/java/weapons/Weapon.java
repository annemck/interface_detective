package weapons;

public abstract class Weapon implements IAttack {

    private int attackDamage;

    public Weapon(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public abstract String attack();
}
