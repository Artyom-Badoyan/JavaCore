package chepter7.varArgs;

public class VarArgs2 {

    static void vaTest2(String msg, int... v) {
        System.out.print(msg + v.length + " Содержимое: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
