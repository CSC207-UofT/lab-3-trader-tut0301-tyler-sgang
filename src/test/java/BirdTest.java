import org.junit.*;

import static org.junit.Assert.*;

public class BirdTest {
    Bird b;

    @Test(timeout = 50)
    public void testsound(){
        assertEquals("Squack!", b.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {

        assertEquals(8, b.getPrice());
    }

    @Test(timeout = 50)
    public void TestGetWingSpan(){
        assertEquals(5, b.getWingSpan());
    }

}
