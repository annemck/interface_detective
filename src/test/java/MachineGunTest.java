import weapons.guns.MachineGun;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MachineGunTest {

    private MachineGun gun;

    @Before
    public void setup() {
        this.gun = new MachineGun(10);
    }

    @Test
    public void hasDamage() {
        assertEquals(10, gun.getAttackDamage());
    }

    @Test
    public void canAttack() {
        assertEquals("BangBangBangBangBangBangBang!", gun.attack());
    }
}
