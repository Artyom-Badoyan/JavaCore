package chepter10.annatation;

public class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("It is Child class Name = " + name);
    }
}
