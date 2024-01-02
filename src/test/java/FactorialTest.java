import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void factorialTest(){
        assertEquals(1, Factorial.getFactorial(0));
        assertEquals(1, Factorial.getFactorial(1));
        assertEquals(2, Factorial.getFactorial(2));
        assertEquals(6, Factorial.getFactorial(3));
        assertEquals(24, Factorial.getFactorial(4));
        assertEquals(720, Factorial.getFactorial(6));
    }
@Test
    public void factorialTestForLageNumber(){
        assertEquals(40320, Factorial.getFactorial(8));
}
        }
