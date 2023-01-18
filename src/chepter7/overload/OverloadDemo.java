package chepter7.overload;

public class OverloadDemo {
    void test1() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    void test1(int a) {
        System.out.println("a: " + a);
    }

    void test1(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    double test1(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}
