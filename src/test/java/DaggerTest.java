import weapons.knives.Dagger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DaggerTest {

    private Dagger dagger;

    @Before
    public void setup() {
        this.dagger = new Dagger(10);
    }

    @Test
    public void hasDamage() {
        assertEquals(10, dagger.getAttackDamage());
    }

    @Test
    public void canAttack() {
        assertEquals("Stabby stabby!", dagger.attack());
    }

    @Test
    public void canCut() {
        assertEquals("Ouch! Nasty cut that.", dagger.cut());
    }
}
