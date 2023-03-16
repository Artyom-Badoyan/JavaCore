package chepter14.work_with_files.serializationObj.programmer3;

import chepter14.work_with_files.serializationObj.Car;
import chepter14.work_with_files.serializationObj.Employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {

        Car car = new Car("BMW", "white");

        Employee employee = new Employee("Artyom", "IT", 32, 500, car);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Employees2.bin"))) {

            outputStream.writeObject(employee);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
