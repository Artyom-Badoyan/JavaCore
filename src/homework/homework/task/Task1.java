package homework.homework.task;

/*
 * Дано порядковый номер месяца. Вести на консоль пару года, к которой относится месяц
 */
public class Task1 {
    public static void main(String[] args) {

        int month = 10;

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима:");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Весна:");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Лето:");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Осень:");
        } else {
            System.out.println("Месяц введен не корректно:");
        }
    }
}
