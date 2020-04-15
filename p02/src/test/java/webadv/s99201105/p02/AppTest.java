package webadv.s99201105.p02;

import org.junit.Assert;
import org.junit.Test;
public class AppTest {
    private String INPUT = "1234";
    @Test
    public void testLength() {
        Assert.assertEquals(64, App.sha256hex(INPUT).length());
    }
    @Test
    public void testHex() {
        String expected = "03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4";
        Assert.assertEquals(expected, App.sha256hex(INPUT));
    }
}
