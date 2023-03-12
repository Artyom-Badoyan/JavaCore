package homework.homework11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExample1 implements Commands {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Poxos");
        list.add("Petros");
        list.add("Martiros");
        list.add("Vardan");
        list.add("Gevor");

        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String commands = scanner.nextLine();

            switch (commands) {
                case EXIT -> isRun = false;
                case PRINT_LIST -> printList(list);
                case NAME -> System.out.println(nameVerification(list));
                case DELETE_NAME -> deleteTheNameFromTheList(list);
                case ADD_NAME_IN_INDEX -> addNameInIndex(list);
            }
        }
    }

    private static void printList(List<String> list) {
        for (String elements : list) {
            System.out.println(elements);
        }
    }

    private static void addNameInIndex(List<String> list) {
        printList(list);
        System.out.println("Please input index:");
        String indexElement = scanner.nextLine();
        System.out.println("Please input name:");
        String nameElement = scanner.nextLine();
        try {
            list.add(Integer.parseInt(indexElement), nameElement);
            printList(list);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please input the correct index:");
        } catch (NumberFormatException e) {
            System.out.println("Please write correct index:");
        }
    }

    private static void deleteTheNameFromTheList(List<String> list) {
        printList(list);
        System.out.println("Please input name:");
        String name = scanner.nextLine();
        list.removeIf(nameElements -> nameElements.contains(name));
        printList(list);
    }

    private static boolean nameVerification(List<String> list) {
        printList(list);
        System.out.println("Please input name:");
        String name = scanner.nextLine();
        if (list.contains(name)) {
            return true;
        }
        return false;
    }
}

