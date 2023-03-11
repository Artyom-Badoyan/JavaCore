package homework.homework11;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample2 implements Commands {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Set<String> list = new TreeSet<>();
        list.add("Simonik");
        list.add("Varujan");
        list.add("Merujan");

        boolean isRun = true;
        while (isRun) {
            Commands.commands();
            String command = scanner.nextLine();

            switch (command) {
                case EXIT -> isRun = false;
                case PRINT_NAMES_LIST -> printNamesList(list);
                case PRINT_NAME_SORTING -> printNameSorting(list);
            }
        }
    }

    private static void printNamesList(Set<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
    }

    private static void printNameSorting(Set<String> list) {
        System.out.println("Please input five names:");
        System.out.println("Please input name1:");
        String name = scanner.nextLine();

        System.out.println("Please input name2:");
        String name1 = scanner.nextLine();

        System.out.println("Please input name3:");
        String name2 = scanner.nextLine();

        System.out.println("Please input name4:");
        String name3 = scanner.nextLine();

        System.out.println("Please input name5:");
        String name4 = scanner.nextLine();

        list.add(name);
        list.add(name1);
        list.add(name2);
        list.add(name3);
        list.add(name4);
        printNamesList(list);
    }
}