package chepter7.overload;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test1();
        ob.test1(10);
        ob.test1(10, 20);
        result = ob.test1(123.25);
        System.out.println("Результат вызова ob.test(123.25): " + result);
    }
}
