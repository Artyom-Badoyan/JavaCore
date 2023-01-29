package chepter8.inheritance.inheritance.ab;

public class SimpleInheritanceAB {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Coдepжимoe объекта superOb: ");
        superOb.showIJ();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Coдepжимoe объекта subOb: ");
        subOb.showIJ();
        subOb.showK();

        System.out.println("Cyммa i, j и k в объекте subOb: ");
        subOb.sum();
    }
}
