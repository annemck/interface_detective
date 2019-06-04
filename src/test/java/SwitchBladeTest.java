import weapons.knives.SwitchBlade;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwitchBladeTest {

    private SwitchBlade blade;

    @Before
    public void setup() {
        this.blade = new SwitchBlade(10);
    }

    @Test
    public void hasDamage() {
        assertEquals(10, blade.getAttackDamage());
    }

    @Test
    public void canAttack() {
        assertEquals("Stabby stab!", blade.attack());
    }

    @Test
    public void canCut() {
        assertEquals("Nasty cut that.", blade.cut());
    }
}
