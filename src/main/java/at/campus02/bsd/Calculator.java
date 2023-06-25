package at.campus02.bsd;
/**
 * @author Jakob Mösenbacher
 */
public class Calculator {

    /**
    * <p> This Method creates the sum of two numbers </p>
    * @param number1 getting fist number for the operation
     * @param number2 getting second number for the operation
     * @return the result of the operation
    */
    public static double add(double number1, double number2){
        return number1 + number2;
    }
    /**
     * <p> This Method creates the difference of these numbers </p>
     * @param number1 getting fist number for the operation
     * @param number2 getting second number for the operation
     * @return the result of the operation
     */
    public static double minus(double number1, double number2){
        return number1 - number2;
    }
    /**
     * <p> This Method creates the quotient of two numbers </p>
     * @param number1 getting fist number for the operation
     * @param number2 getting second number for the operation
     * @throws IllegalArgumentException if the second parameter is 0 then the exception is thrown
     * @return the result of the operation
     */
    public static double divide(double number1, double number2){
        if(number2 == 0){
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        }
        return number1/number2;
    }
    /**
     * <p> This Method creates the product of two numbers </p>
     * @param number1 getting fist number for the operation
     * @param number2 getting second number for the operation
     * @return the result of the operation
     */
    public static double multiply(double number1, double number2){
        return number1 * number2;
    }
    /**
     * <p> This Method creates the factorial of a number</p>
     * @param number1 getting fist number for the operation
     * @return the result of the operation
     */
     public static double factorial(double number1){
        if(number1 < 0){
            return 0;
        }
        else if (number1 <= 1 && number1 >= 0){
            return 1;
        }
        else {
            return number1 * factorial(number1 - 1);
        }
    }
}
