package chepter11.enums;

public class ToDay {

    WeekDays weekDays;

    public ToDay(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo() {
        switch (weekDays) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Иди на работу:");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Ты можешь отдохнуть:");
                break;

        }
        System.out.println("Настроение в этот день: " + weekDays.getMood());
    }
}
