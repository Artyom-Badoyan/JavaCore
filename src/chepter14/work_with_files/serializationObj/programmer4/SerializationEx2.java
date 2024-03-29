package chepter14.work_with_files.serializationObj.programmer4;

import chepter14.work_with_files.serializationObj.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {

        Employee bestEmployee;

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Employees2.bin"))) {

            bestEmployee = (Employee) inputStream.readObject();
            System.out.println(bestEmployee);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
