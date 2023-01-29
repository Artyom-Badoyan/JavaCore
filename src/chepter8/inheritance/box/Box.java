package chepter8.inheritance.box;

public class Box {
    double width;
    double height;
    double depth;

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

    public Box(double len) {
        width = height = depth = len;
    }

    public double volume() {
        return width * height * depth;
    }
}
