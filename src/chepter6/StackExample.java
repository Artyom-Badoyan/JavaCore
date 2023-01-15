package chepter6;

public class StackExample {

    int[] array = new int[10];
    int tos;

    public StackExample() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("в StackExample места заполнено: ");
        } else {
            array[++tos] = item;
        }
    }

    int pop() {
        if (tos == -1) {
            System.out.println(" StackExample пустой: ");
            return 0;
        }
        return array[tos--];
    }
}
