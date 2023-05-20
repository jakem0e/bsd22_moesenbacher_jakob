package at.campus02.bsd;

public class Main {
    // Reset
    public static final String RESET = "\033[0m";
    // Regular Colors
    public static final String BLACK = "\033[0;30m"; // BLACK
    public static final String RED = "\033[0;31m"; // RED
    public static final String GREEN = "\033[0;32m"; // GREEN
    public static final String YELLOW = "\033[0;33m"; // YELLOW
    public static final String BLUE = "\033[0;34m"; // BLUE
    public static final String PURPLE = "\033[0;35m"; // PURPLE
    public static final String CYAN = "\033[0;36m"; // CYAN
    public static final String WHITE = "\033[0;37m"; // WHITE

    public static void main(String[] args) {
        double number1 = 2;
        double number2 = 3;

        System.out.println(BLUE + "add" + RESET);
        System.out.println(Calculator.add(number1, number2) + "\n");
        System.out.println(BLUE + "minus" + RESET);
        System.out.println(Calculator.minus(number1, number2) + "\n");
        System.out.println(BLUE + "divide" + RESET);
        System.out.println(Calculator.divide(number1, number2) + "\n");
        System.out.println(BLUE + "multiply" + RESET);
        System.out.println(Calculator.multiply(number1, number2) + "\n");
    }
}
