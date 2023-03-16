package chepter14.work_with_files.buffer_copy_file;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("text2.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("text4.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write('\n');
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
