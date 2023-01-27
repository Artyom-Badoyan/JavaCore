package chepter7.varArgs;

import static chepter7.varArgs.VarArgs2.vaTest2;

public class VarArgs2Test {
    public static void main(String[] args) {
        vaTest2("Один параметр переменной длины: ", 10);
        vaTest2("Tpи параметра переменной длины: ", 1, 2, 3);
        vaTest2("Без параметров переменной длины: ");
    }
}
