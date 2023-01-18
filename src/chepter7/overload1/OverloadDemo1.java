package chepter7.overload1;

public class OverloadDemo1 {

    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Bнyтpeннee преобразование при вызове "
                + "test(douЬle) а: " + a);
    }
}
