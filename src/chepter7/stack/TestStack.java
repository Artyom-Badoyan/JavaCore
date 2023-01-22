package chepter7.stack;

public class TestStack {
    public static void main(String[] args) {
        Stack1 myStack1 = new Stack1();
        Stack1 myStack2 = new Stack1();

        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            myStack2.push(i);
        }
        System.out.println("Стек в mystackl:");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
