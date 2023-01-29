package chepter8.inheritance.box2;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
