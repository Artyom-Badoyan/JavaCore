package chepter7.test1;

public class CallByValue1 {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a и b до вызова: " +
                a + " " + b);

        ob.meth(a, b);
        System.out.println("a и b после вызова: " +
                a + " " + b);
    }
}
