package chepter9.defaultImplementation;

public interface MyIF {

    int getNumber();

    default String getString() {
        return "Объект типа String по умолчанию";
    }
}
