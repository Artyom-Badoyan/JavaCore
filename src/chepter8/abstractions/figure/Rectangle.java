package chepter8.abstractions.figure;

public class Rectangle extends Figure {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("B области четырехугольника.");
        return dim1 * dim2;
    }
}
