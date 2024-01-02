import org.testng.Assert;
import org.testng.annotations.Test;

public class factorialTest {
    @Test
    public void testFactorialZero() {
        Assert.assertEquals(Factorial.getFactorial(0), 1);
    }

    @Test
    public void testFactorialPositive() {
        Assert.assertEquals(Factorial.getFactorial(9), 362880);
    }
}
