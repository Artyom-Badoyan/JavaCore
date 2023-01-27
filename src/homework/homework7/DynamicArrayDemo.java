package homework.homework7;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.print();
        dynamicArray.deleteByIndex(3);
        dynamicArray.print();
        dynamicArray.set(2, 1);
        dynamicArray.print();
        dynamicArray.add(3, 10);
        dynamicArray.print();
        System.out.println(dynamicArray.exists(2));
        System.out.println(dynamicArray.getIndexByValue(1));
    }
}
