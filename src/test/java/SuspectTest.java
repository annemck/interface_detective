import people.Detective;
import people.Suspect;
import weapons.guns.MachineGun;
import weapons.guns.Revolver;
import weapons.knives.Dagger;
import weapons.knives.SwitchBlade;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuspectTest {

    private Suspect suspect;
    private SwitchBlade blade;
    private Detective detective;

    @Before
    public void setup() {
        blade = new SwitchBlade(5);
        this.suspect = new Suspect("Jim", 50, blade, true);
        this.detective = new Detective("Joe", 90, blade);
    }

    @Test
    public void hasName() {
        assertEquals("Jim", suspect.getName());
    }

    @Test
    public void hasStartingHealth() {
        assertEquals(50, suspect.getHealth());
    }

    @Test
    public void canGetWeapon() {
        assertEquals(blade, suspect.getWeapon());
    }

    @Test
    public void startsWithGuiltStatus(){
        assertEquals(true, suspect.getGuilt());
    }

    @Test
    public void canAttack() {
        assertEquals("Stabby stab!", suspect.attack(detective));
        assertEquals(85, detective.getHealth());
    }

    @Test
    public void canHaveDaggerAsWeapon() {
        Dagger dagger = new Dagger(1);
        suspect = new Suspect("Bob", 50, dagger, false);
        assertEquals(dagger, suspect.getWeapon());
    }

    @Test
    public void canHaveMachineGunAsWeapon() {
        MachineGun gun = new MachineGun(4);
        suspect = new Suspect("Bob", 50, gun, false);
        assertEquals(gun, suspect.getWeapon());
    }

    @Test
    public void canHaveRevolverAsWeapon() {
        Revolver gun = new Revolver(5);
        suspect = new Suspect("Bob", 50, gun, true);
        assertEquals(gun, suspect.getWeapon());
    }
}
