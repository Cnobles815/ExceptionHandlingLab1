package nobles.christopher.ExceptionHandlingLab1;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by christophernobles on 9/30/16.
 */
public class CalculatorTEST {
    @Test
    public void addTEST(){
        Calculator calculator = new Calculator();
        int expectedValue = 2;
        int actualValue = calculator.add(1, 1);
        assertEquals("The value should be", expectedValue, actualValue);
    }

    @Test
    public void subtractTEST(){
        Calculator calculator = new Calculator();
        int expectedValue = 2;
        int actualValue = calculator.subtract(3, 1);
        assertEquals("The value should be 2" , expectedValue, actualValue);
    }

    @Test
    public void multiplyTEST(){
        Calculator calculator = new Calculator();
        int expectedValue = 4;
        int actualValue = calculator.multiply(2, 2);
        assertEquals("The value should be 4" , expectedValue, actualValue);
    }
    @Test
    public void divideTEST(){
        Calculator calculator = new Calculator();
        int expectedValue = 4;
        int actualValue = calculator.divide(16, 4);
        assertEquals("The value should be 4" , expectedValue, actualValue);
    }
}
