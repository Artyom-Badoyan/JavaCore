package chepter10.annatationExample;

import java.lang.annotation.Annotation;

public class Test {
    public static void main(String[] args) {
        try {
            Class xiaomiClass = Class.forName("chepter10.annatationExample.Xiaomi");
            Annotation annotation = xiaomiClass.getAnnotation(SmartPhone.class);
            SmartPhone smartPhone = (SmartPhone) annotation;
            System.out.println("Annotation info from Xiaomi class: " + smartPhone.OS() + ", " +
                    smartPhone.yearOfCompanyCreation());
        } catch (ClassNotFoundException e) {
            System.out.println("такой Annotation не найден");
        }

        try {
            Class iphoneClass = Class.forName("chepter10.annatationExample.Iphone");
            Annotation annotation = iphoneClass.getAnnotation(SmartPhone.class);
            SmartPhone smartPhone = (SmartPhone) annotation;
            System.out.println("Annotation info from Iphone class: " + smartPhone.OS() + ", " +
                    smartPhone.yearOfCompanyCreation());
        } catch (ClassNotFoundException e) {
            System.out.println("такой Annotation не найден");
        }
    }
}
