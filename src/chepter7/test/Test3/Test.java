package chepter7.test.Test3;

public class Test {
    int a;

    public Test(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}
