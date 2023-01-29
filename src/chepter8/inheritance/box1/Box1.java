package chepter8.inheritance.box1;

public class Box1 {
    private double width;
    private double height;
    private double depth;

    public Box1(Box1 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    public Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box1(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
