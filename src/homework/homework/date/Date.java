package homework.homework.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
        java.util.Date myDate = new java.util.Date();
        System.out.println(myDate);
        System.out.println(simpleDateFormat.format(myDate));

        System.out.println(System.currentTimeMillis());
        System.out.println();


        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
        System.out.println("Please input DateEmp(14-02-2023)");
        Scanner scanner = new Scanner(System.in);
        String dateStr = scanner.nextLine();
        java.util.Date parse = sdf.parse(dateStr);
        System.out.println(parse);
    }
}
