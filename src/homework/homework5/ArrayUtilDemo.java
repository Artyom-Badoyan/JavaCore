package homework.homework5;

public class ArrayUtilDemo {
    public static void main(String[] args) {

        int[] array = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3};
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.elementsArray(array);
        arrayUtil.oneAndMiddleAndLastElements(array);
        arrayUtil.maxOfArray(array);
        arrayUtil.minOfArray(array);
        arrayUtil.evenElementsAndCount(array);
        arrayUtil.oddElementsAndCount(array);
        arrayUtil.arithmeticMeanElements(array);
    }
}
