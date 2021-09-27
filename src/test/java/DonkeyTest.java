import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DonkeyTest {
    Donkey donkey;

    @Before
    public void setUp() throws Exception {
        donkey = new Donkey();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("uhhh donkey?", donkey.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, donkey.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        donkey.upgradeSpeed();
        assertEquals(101, donkey.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        donkey.downgradeSpeed();
        assertEquals(99, donkey.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1, donkey.getPrice());
    }

}
