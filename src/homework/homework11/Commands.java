package homework.homework11;

public interface Commands {

    String EXIT = "0";
    String PRINT_LIST = "1";
    String NAME = "2";
    String DELETE_NAME = "3";
    String ADD_NAME_IN_INDEX = "4";
    String PRINT_NAMES_LIST = "5";
    String PRINT_NAME_SORTING = "6";

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + PRINT_LIST + " for list print elements");
        System.out.println("Please input " + NAME + " for name verification");
        System.out.println("Please input " + DELETE_NAME + " for delete name");
        System.out.println("Please input " + ADD_NAME_IN_INDEX + " for add the name to the index");
    }

    static void commands() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + PRINT_NAMES_LIST + " print names the list ");
        System.out.println("Please input " + PRINT_NAME_SORTING + " print name sorting");
    }
}
