package chepter7.stack;

public class Stack1 {
    private int stack[] = new int[10];
    private int tos;

    Stack1() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Cтeк заполнен!");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен!");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
