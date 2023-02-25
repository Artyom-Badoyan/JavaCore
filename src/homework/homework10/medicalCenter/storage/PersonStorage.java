package homework.homework10.medicalCenter.storage;

import homework.homework10.medicalCenter.model.Doctor;
import homework.homework10.medicalCenter.model.Patient;
import homework.homework10.medicalCenter.model.Person;
import homework.homework10.medicalCenter.util.DateUtil;

import java.util.Date;

public class PersonStorage {

    private Person[] persons = new Person[10];
    private int size;

    public void add(Person person) {
        if (persons.length == size) {
            extend();
        }
        persons[size++] = person;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                System.out.println(persons[i]);
            }
        }
    }

    public void printPatients() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                System.out.println(persons[i]);
            }
        }
    }

    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor && ((Doctor) persons[i]).getProfession().equals(profession)) {
                System.out.println(persons[i]);
            }
        }
    }

    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor && persons[i].getId().equals(id)) {
                deletePersonByIndex(i);
            }
        }
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor && persons[i].getId().equals(id)) {
                return (Doctor) persons[i];
            }
        }
        return null;
    }

    public void searchPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient && ((Patient) persons[i]).getDoctor().equals(doctor)) {
                System.out.println(persons[i]);
            }
        }
    }

    public void printTodayPatients() {
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient && DateUtil.isSameDay(today, ((Patient) persons[i]).getRegisterDateTime())) {
                System.out.println(persons[i]);
            }
        }
    }

    private void deletePersonByIndex(int i) {
        for (int j = i; j < size; j++) {
            persons[j] = persons[j + 1];
        }
        size--;
    }

    private void extend() {
        Person[] tmp = new Person[persons.length + 10];
        System.arraycopy(persons, 0, tmp, 0, size);
        persons = tmp;
    }

    public boolean isDoctorAvailable(Date registerDateTime, Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient && ((Patient) persons[i]).getDoctor().equals(doctor)
                    && ((Patient) persons[i]).getRegisterDateTime().equals(registerDateTime)) {
                return false;
            }
        }
        return true;
    }
}
