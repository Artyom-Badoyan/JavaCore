package homework.homework7;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(10);

        dynamicArray.print();
        dynamicArray.deleteByIndex(7);
        dynamicArray.set(3, 40);
        dynamicArray.add(1, 25);
        System.out.println(dynamicArray.exists(2));
        System.out.println(dynamicArray.getIndexByValue(4));
        System.out.println(dynamicArray.getByIndex(3));


    }
}
