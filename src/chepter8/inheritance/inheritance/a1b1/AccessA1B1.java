package chepter8.inheritance.inheritance.a1b1;

public class AccessA1B1 {
    public static void main(String[] args) {

        B1 subOb = new B1();
        subOb.setIJ(10, 12);
        subOb.sum();
        System.out.println("Cyммa равна " + subOb.total);
    }
}
