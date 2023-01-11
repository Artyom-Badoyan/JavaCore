package chepter6;

public class BoxDemo1 {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        myBox.width = 10;
        myBox.depth = 15;
        myBox.height = 20;

        vol = myBox.depth * myBox.height * myBox.width;
        System.out.println("Oбъeм равен " + vol);

    }
}
