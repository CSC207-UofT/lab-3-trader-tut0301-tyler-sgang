import org.junit.*;

import static org.junit.Assert.*;

public class FoxTest {
    Fox f;

    @Before
    public void setup() throws Exception{
        f = new Fox();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Yippie!", f.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(90, f.getPrice());
    }

    @Test(timeout = 50)
    public void TestGetTails(){ assertEquals(9, f.getTails());}
}
