import people.Detective;
import people.Suspect;
import weapons.guns.MachineGun;
import weapons.guns.Revolver;
import weapons.knives.Dagger;
import weapons.knives.SwitchBlade;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DetectiveTest {

    private Detective detective;
    private Revolver gun;
    private Suspect suspect;
    private SwitchBlade blade;

    @Before
    public void setUp() {
        this.gun = new Revolver(10);
        this.detective = new Detective("Joe", 90, gun);
        this.blade = new SwitchBlade(5);
        this.suspect = new Suspect("Jim", 20, blade, true);

    }

    @Test
    public void hasName() {
        assertEquals("Joe", detective.getName());
    }

    @Test
    public void hasStartingHealth() {
        assertEquals(90, detective.getHealth());
    }

    @Test
    public void hasWeapon() {
        assertEquals(gun, detective.getWeapon());
    }

    @Test
    public void canQuestionSuspect(){
        assertEquals("Did ya do it Jim?", detective.question(suspect));
    }

    @Test
    public void canThreatenSuspect(){
        assertEquals("You can either lie to me Jim or I can kill you, which is it?", detective.threaten(suspect));
    }

    @Test
    public void canAttackSuspect(){
        assertEquals("Bang bang!", detective.attack(suspect));
        assertEquals(10, suspect.getHealth());
    }

    @Test
    public void canKillGuiltySuspect() {
        detective.attack(suspect);
        assertEquals("Bang bang! You got what was coming to ya.", detective.attack(suspect));
        assertEquals(0, suspect.getHealth());
    }

    @Test
    public void canAttackInnocentSuspect() {
        Suspect innocent = new Suspect("Mary", 10, gun, false);
        assertEquals("Bang bang! Well, this'll be a lotta paperwork.", detective.attack(innocent));
        assertEquals(0, innocent.getHealth());
    }

    @Test
    public void canHaveMachineGunAsWeapon() {
        MachineGun gun = new MachineGun(4);
        detective = new Detective("Bob", 50, gun);
        assertEquals(gun, detective.getWeapon());
    }

    @Test
    public void canHaveDaggerAsWeapon() {
        Dagger dagger = new Dagger(4);
        detective = new Detective("Bob", 50, dagger);
        assertEquals(dagger, detective.getWeapon());
    }

    @Test
    public void canHaveSwitchBladeAsWeapon() {
        detective = new Detective("Bob", 50, blade);
        assertEquals(blade, detective.getWeapon());
    }
}
