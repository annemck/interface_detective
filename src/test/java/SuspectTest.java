import people.Detective;
import people.Suspect;
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
}
