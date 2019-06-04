import weapons.guns.Revolver;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RevolverTest {

    private Revolver gun;

    @Before
    public void setup() {
        this.gun = new Revolver(10);
    }

    @Test
    public void canFireGun(){
        assertEquals("Bang bang!", gun.attack());
    }

    @Test
    public void hasDamage() {
        assertEquals(10, gun.getAttackDamage());
    }
}
