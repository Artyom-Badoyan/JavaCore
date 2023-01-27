package chepter7.varArgs;

import static chepter7.varArgs.VarArgs.vaTest;

public class VarArgsTest {
    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
