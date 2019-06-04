package people;

import weapons.Weapon;

public abstract class Person {

    private String name;
    private int health;
    private Weapon weapon;

    public Person(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int damage){
        this.health -= damage;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

}
