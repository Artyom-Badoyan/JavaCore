package chepter14.work_with_files.buffer_copy_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPhoto {
    public static void main(String[] args) {

        try (FileInputStream inputStream = new FileInputStream("E:\\nkarner meronq\\TYOM.jpg")) {

            FileOutputStream outputStream = new FileOutputStream("TYOM.jpg");
            int photo;
            while ((photo = inputStream.read()) != -1) {
                outputStream.write(photo);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
