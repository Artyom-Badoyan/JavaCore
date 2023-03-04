package chepter11.enums;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ToDay toDay = new ToDay(WeekDays.WEDNESDAY);
        toDay.daysInfo();
        System.out.println(toDay.weekDays);
        System.out.println();
        try {
            WeekDays weekDays = WeekDays.valueOf("MONDAY");
            System.out.println(weekDays);
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Пожалуйста, пишите правильно:");
        }

        WeekDays[] days = WeekDays.values();
        System.out.println(Arrays.toString(days));
    }
}
