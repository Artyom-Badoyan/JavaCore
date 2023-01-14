package homework.homework6;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double numberOne = 5.8;
        double numberTwo = 8.4;

        System.out.println(calculator.plus(numberOne, numberTwo));
        System.out.println(calculator.minus(numberOne, numberTwo));
        System.out.println(calculator.multiply(numberOne, numberTwo));
        System.out.println(calculator.divide(numberOne, numberTwo));
    }
}
