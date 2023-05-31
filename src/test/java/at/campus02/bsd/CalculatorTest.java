package at.campus02.bsd;

import org.junit.jupiter.api.*;
import java.math.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public  void setup(){
        calculator = new Calculator();
    }

    //ADD
    @Test
    public void addExpected(){
        Assertions.assertEquals(10, calculator.add(6.0, 4.0));
    }

    @Test
    public void addActual(){
        double result = 6.0 + 4.0;
        Assertions.assertEquals(result, calculator.add(6.0, 4.0));
    }
    @Test
    public void addActual2(){
        double result = 345.0 + 98.0;
        Assertions.assertEquals(result, calculator.add(345.0, 98.0));
    }



    //MINUS
    @Test
    public void minusExpected(){
        Assertions.assertEquals(2, calculator.minus(6.0, 4.0));
    }

    @Test
    public void minusActual(){
        double result = 6.0 - 4.0;
        Assertions.assertEquals(result, calculator.minus(6.0, 4.0));
    }

    @Test
    public void minusActual2(){
        double result = 5.0 - 100.0;
        Assertions.assertEquals(result, calculator.minus(5.0, 100.0));
    }

    //DIVIDE
    @Test
    public void divideExpected01(){
        Assertions.assertEquals(2.5, calculator.divide(5.0, 2.0));
    }

    @Test
    public void divideActual(){
        double result = 5.0/2.0;
        Assertions.assertEquals(result, calculator.divide(5.0, 2.0));
    }

    @Test
    public void divideExpected02(){Assertions.assertThrows(IllegalArgumentException.class, () -> {
        calculator.divide(5, 0);
    });
    }

    //MULTIPLY
    @Test
    public void multiplyExpected(){
        Assertions.assertEquals(10, calculator.multiply(5.0, 2.0));
    }

    @Test
    public void multiplyActual(){
        double result = 5.0*2.0;
        Assertions.assertEquals(result, calculator.multiply(5.0, 2.0));
    }

    @Test
    public void multiplyActual2(){
        double result = 5.0*60.0;
        Assertions.assertEquals(result, calculator.multiply(5.0,60.0));
    }

    //Factorial
    @Test
    public void factorialExpected01(){
        Assertions.assertEquals(0, calculator.factorial(-5));
    }

    @Test
    public void factorialExpected02(){
        Assertions.assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void factorialExpected03(){
        Assertions.assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void factorialExpected05(){
        Assertions.assertEquals(2, calculator.factorial(2));
    }
    public void factorialExpected04(){
        Assertions.assertEquals(0, calculator.factorial(-5));
    }
}