package chepter9.interfaces;

abstract class Incomplete implements Callback {

    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }

}
