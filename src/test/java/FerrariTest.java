/*
 * This file contains sample JUnit test cases for Ferrari.java
 */

import org.junit.*;

import static org.junit.Assert.*;

public class FerrariTest {
    Ferrari f1;

    @Before
    public void setUp() throws Exception {
        f1 = new Ferrari();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("ZOOM!", f1.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(50, f1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        f1.upgradeSpeed();
        assertEquals(55, f1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        f1.downgradeSpeed();
        assertEquals(45, f1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(25, f1.getPrice());
    }
}
