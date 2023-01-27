package chepter7.passArray;

public class PassArray {
    static void vaTest(int v[]) {
        System.out.print("Koличecтвo аргументов: " + v.length + " Содержимое: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
