package chepter6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        vol = myBox1.volume1();
        System.out.println("Oбъeм равен " + vol);

        vol = myBox2.volume1();
        System.out.println("Oбъeм равен " + vol);
    }
}
