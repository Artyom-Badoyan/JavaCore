package homework.homework13;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        searchFileName();
        searchFileByKeyword();
        searchKeywordInStringOutputLine();
        printSizeOfFiles();
        createFile();
    }

    private static void createFile() {
        System.out.println("Please input folder path");
        String folderPath = scanner.nextLine();
        System.out.println("Please input file name");
        String fileName = scanner.nextLine();
        System.out.println("Please input content");
        String content = scanner.nextLine();
        createFileWithContent(folderPath, fileName, content);
    }

    private static void printSizeOfFiles() {
        System.out.println("Please input folder path");
        String folderPath = scanner.nextLine();
        printSizeOfPackage(folderPath);
    }

    private static void searchKeywordInStringOutputLine() {
        System.out.println("Please input file path");
        String filePath = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        findLines(filePath, keyword);
    }

    private static void searchFileByKeyword() {
        System.out.println("Please input folder path");
        String folderPath = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        contentSearch(folderPath, keyword);
    }

    private static void searchFileName() {
        System.out.println("Please input folder folderPath");
        String folderPath = scanner.nextLine();
        System.out.println("Please input folder folderName");
        String folderName = scanner.nextLine();
        fileSearch(folderPath, folderName);
    }

    private static void fileSearch(String folder, String fileName) {
        File folderFile = new File(folder);
        if (!folderFile.isDirectory()) {
            System.out.println("Wrong folder path:");
            return;
        }
        File[] listFiles = folderFile.listFiles();
        boolean isFound = false;
        for (File file : listFiles) {
            if (file.isFile() && file.getName().contains(fileName)) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound);
    }

    public static void contentSearch(String folder, String keyword) {
        File folderFile = new File(folder);
        if (!folderFile.isDirectory()) {
            System.out.println("Wrong folder path:");
            return;
        }
        File[] listFiles = folderFile.listFiles();
        for (File file : listFiles) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                    String line = null;
                    while ((line = bufferedReader.readLine()) != null) {
                        if (line.contains(keyword)) {
                            System.out.println(file);
                            break;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static void findLines(String filePath, String keyword) {
        File file = new File(filePath);
        if (!file.exists() || !file.getName().endsWith(".txt")) {
            System.out.println("Wrong file path:");
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            int lineNumber = 1;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(lineNumber + ". " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void printSizeOfPackage(String folderPath) {
        File folderFile = new File(folderPath);
        if (!folderFile.isDirectory()) {
            System.out.println("Wrong folder path:");
            return;
        }
        File[] files = folderFile.listFiles();
        long size = 0;
        for (File file : files) {
            if (file.isFile()) {
                size += file.length();
            }
        }
        System.out.println("size: " + size / 1024 + " KB");
    }

    static void createFileWithContent(String folderPath, String fileName, String content) {
        File folderFile = new File(folderPath);
        if (!folderFile.isDirectory()) {
            System.out.println("Wrong folder path:");
            return;
        }
        File file = new File(folderFile, fileName);
        if (file.exists()) {
            System.out.println("File already exists!");
            return;
        }
        try {
            boolean newFile = file.createNewFile();
            if (newFile) {
                try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file))) {
                    fileWriter.write(content);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
