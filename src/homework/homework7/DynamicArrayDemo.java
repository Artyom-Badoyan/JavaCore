package homework.homework7;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(5);
        dynamicArray.add(5);

        dynamicArray.print();
        dynamicArray.deleteByIndex(3);
        dynamicArray.set(3, 40);
        dynamicArray.add(4, 50);
        System.out.println(dynamicArray.exists(10));
        System.out.println(dynamicArray.getIndexByValue(5));
        System.out.println(dynamicArray.getByIndex(2));
    }
}
