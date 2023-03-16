package chepter14.work_with_files.file_reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {

        try (FileReader reader = new FileReader("text3.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        }
    }
}
