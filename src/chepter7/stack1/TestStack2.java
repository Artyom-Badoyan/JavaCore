package chepter7.stack1;

public class TestStack2 {
    public static void main(String[] args) {
        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(8);

        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }
        System.out.print("Cтeк в mystackl: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(myStack1.pop() + " ");
        }
        System.out.println();
        System.out.print("Стек в mystack2: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(myStack2.pop() + " ");
        }
    }
}
