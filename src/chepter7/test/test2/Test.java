package chepter7.test.test2;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = j;
        b = j;
    }

    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}
