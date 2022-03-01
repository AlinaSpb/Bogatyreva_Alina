package lesson4;

import org.junit.Assert;
import org.junit.Test;


public class TriangleTest {

    @Test
    public void ariaPositiveTest() {
        int a = 20, b = 20, c = 30;
        try {
            Assert.assertEquals(198, Triangle.area(a, b, c));
        } catch (TriangleException e) {
            Assert.fail();
        }
    }

    @Test
    public void ariaNegativeTest1() {
        int a = 0, b = -20, c = 30;
        try {
            Triangle.area(a, b, c);
            Assert.fail();
        } catch (TriangleException e) {
        }
    }

    @Test
    public void ariaNegativeTest2() {
        int a = 20, b = 20, c = 300;
        try {
            Triangle.area(a, b, c);
            Assert.fail();
        } catch (TriangleException e) {
        }
    }
}
