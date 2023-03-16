package chepter14.work_with_files.serializationObj;

import java.io.Serializable;

public class Car implements Serializable {

    String model;
    String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
