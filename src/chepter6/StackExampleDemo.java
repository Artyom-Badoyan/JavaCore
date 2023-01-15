package chepter6;

public class StackExampleDemo {
    public static void main(String[] args) {
        StackExample stackExample = new StackExample();
        stackExample.push(5);
        stackExample.push(10);
        stackExample.push(15);
        stackExample.push(20);
        System.out.println(stackExample.pop());
        System.out.println(stackExample.pop());
    }
}
