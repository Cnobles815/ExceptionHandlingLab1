package nobles.christopher.ExceptionHandlingLab1;

/**
 * Created by christophernobles on 9/30/16.
 */
public class Calculator {
    public static int add(int a, int b){
        return (a + b);
    }

    public static int subtract(int a, int b){
        return (a - b);
    }

    public static int multiply(int a, int b){
        return (a * b);
    }

    public static int divide (int a, int b)
            throws DivisionByZeroException{
        return (a / b);
    }

    public static double squareRoot (int a)
            throws ComplexNumberException{
        return Math.sqrt(a);
    }
}
