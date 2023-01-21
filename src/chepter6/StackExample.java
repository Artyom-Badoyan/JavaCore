package chepter6;

public class StackExample {

    private int[] array = new int[10];
    private int tos;

    public StackExample() {
        tos = -1;
    }

    public void push(int item) {
        if (tos == 9) {
            System.out.println("в StackExample места заполнено: ");
        } else {
            array[++tos] = item;
        }
    }

    public int pop() {
        if (tos == -1) {
            System.out.println(" StackExample пустой: ");
            return 0;
        }
        return array[tos--];
    }
}
