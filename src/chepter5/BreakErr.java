package chepter5;

public class BreakErr {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.println("Пpoxoд " + i + ": ");
        }
        for (int j = 0; j < 100; j++) {
            if (j == 10) {
                System.out.println(j + " ");
            }
        }
    }
}
