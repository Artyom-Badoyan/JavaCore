package homework.homework6;

public class Calculator {

    double plus(double numOne, double numTwo) {
        return numOne + numTwo;
    }

    double minus(double numOne, double numTwo) {
        return numOne - numTwo;
    }

    double divide(double numOne, double numTwo) {
        if (numTwo == 0) {
            System.out.println("number is not divisible by 0");
            return -1;
        }
        return numOne / numTwo;
    }

    double multiply(double numOne, double numTwo) {
        return numOne * numTwo;
    }
}
