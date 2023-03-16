package chepter14.work_with_files.random_Access;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFile {

    public static void main(String[] args) {

        try(java.io.RandomAccessFile file = new java.io.RandomAccessFile("text101.txt","rw")) {

            int read = file.read();
            System.out.println((char) read);

            file.seek(101);
            String line = file.readLine();
            System.out.println(line);

            long positions = file.getFilePointer();
            System.out.println(positions);

            file.seek(file.length()-1);
            file.writeBytes("\n\t\t\t\t\tАлександр Пушкин");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
