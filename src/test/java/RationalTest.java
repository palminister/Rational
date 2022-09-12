import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        // expect 3/4
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }
    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        // expect 1/4
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }
    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.multiply(y);
        // expect 1/8
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(8, x.denominator);
    }
    @Test
    public void testDivide() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.divide(y);
        // expect 2/1
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }
    @Test
    public void testEquals() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 4;
        Rational z = new Rational();
        z.numerator = 1;
        z.denominator = 2;
        Assert.assertEquals(true, x.equals(y));
        Assert.assertEquals(true, x.equals(z));
    }
    @Test
    public void testCompareTo() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        Assert.assertEquals(1, x.compareTo(y));
        Assert.assertEquals(-1, y.compareTo(x));
        Assert.assertEquals(0, y.compareTo(y));
    }
    @Test
    public void testToString() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Assert.assertEquals("1/2",  x.toString());
    }
}
