import org.junit.*;

import static org.junit.Assert.*;

public class DragonTest {
    Dragon d;

    @Before
    public void setUp() throws Exception {
        d = new Dragon();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("eeaaaa", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1000, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        d.upgradeSpeed();
        assertEquals(1010, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        d.downgradeSpeed();
        assertEquals(990, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(90000, d.getPrice());
    }
}
