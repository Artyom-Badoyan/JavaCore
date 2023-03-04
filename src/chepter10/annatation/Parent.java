package chepter10.annatation;

public class Parent {

    String name;

    public Parent(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("It is Prent class Name = " + name);
    }

    @Deprecated
    void showInfo1() {
        System.out.println("It is Prent class Name = " + name);
    }
}
