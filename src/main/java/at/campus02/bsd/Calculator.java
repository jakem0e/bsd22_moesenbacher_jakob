package at.campus02.bsd;

public class Calculator {

    public static double add(double number1, double number2){
        return number1 + number2;
    }
    public static double minus(double number1, double number2){
        return number1 - number2;
    }
    public static double divide(double number1, double number2){
        if(number2 == 0){
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        }
        return number1/number2;
    }
    public static double multiply(double number1, double number2){
        return number1 * number2;
    }
}
