package homework.homework.switchExample;

public class Switch {
    public static void main(String[] args) {
        //byte, short, int, char, String, enum
        //switch
        int value = 1;
        switch (value) {
            case 1:
                System.out.println("value == 1");
                break;
            case 2:
                System.out.println("value == 2");
                break;
            case 3:
                System.out.println("value == 3");
                break;
            case 4:
                System.out.println("value == 4");
                break;
            case 5:
                System.out.println("value == 5");
                break;
            default:
                System.out.println("нет такого значения:");
        }

        //switch1
        int value1 = 1;
        switch (value1) {
            case 1:
            case 2:
            case 3:
                System.out.println("value == 1,2,3");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("value == 4,5,6");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("value == 7,8,9");
                break;
            case 10:
                System.out.println("value == 10");
                break;
            default:
                System.out.println("нет такого значения:");
        }

        //switch2
        int value2 = 5;
        switch (value2) {
            case 1 -> System.out.println("value == 1");
            case 2 -> System.out.println("value == 2");
            case 3 -> System.out.println("value == 3");
            case 4 -> System.out.println("value == 4");
            case 5 -> System.out.println("value == 5");
            default -> System.out.println("вы набрали неправильный номер");
        }

        //switch3
        var value3 = 3;
        var charValue = switch (value3) {
            case 1 -> '1';
            case 2 -> '2';
            case 3 -> '3';
            default -> '0';

        };
    }
}
