package chepter14.work_with_files.serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {

        List<String> employee = new ArrayList<>();
        employee.add("Artyom");
        employee.add("Gevorg");
        employee.add("Petros");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Employee1.bin"))) {

            outputStream.writeObject(employee);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
