package chepter8.abstractions.figure;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figureF;
        figureF = r;
        System.out.println("Плoщaдь равна " + figureF.area());
        figureF = t;
        System.out.println("Плoщaдь равна " + figureF.area());
    }
}
