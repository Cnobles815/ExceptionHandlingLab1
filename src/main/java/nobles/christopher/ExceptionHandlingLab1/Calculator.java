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
        if (a == 0 || b == 0) {
            throw new DivisionByZeroException();
        }
        return (a / b);
    }

    //I plainly do not understand what a complex number is/does so I cannot write a method for it
//    public static double squareRoot (int a)
//            throws ComplexNumberException{
//        return Math.sqrt(a);
//    }
}
