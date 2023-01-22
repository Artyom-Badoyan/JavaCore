package chepter7.recursia.recursion2;

public class Recursion2 {
    public static void main(String[] args) {

        RecTest ob = new RecTest(10);
        int j;

        for (int i = 0; i < 10; i++) {
            ob.values[i] = i;
        }
        ob.printArray(10);
    }
}
