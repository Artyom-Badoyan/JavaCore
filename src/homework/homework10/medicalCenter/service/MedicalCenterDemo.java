package homework.homework10.medicalCenter.service;

import homework.homework10.medicalCenter.Commands;
import homework.homework10.medicalCenter.model.Doctor;
import homework.homework10.medicalCenter.model.Patient;
import homework.homework10.medicalCenter.model.Profession;
import homework.homework10.medicalCenter.storage.PersonStorage;
import homework.homework10.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String commands = scanner.nextLine();

            switch (commands) {
                case EXIT -> isRun = false;
                case ADD_DOCTOR -> addDoctor();
                case SEARCH_DOCTOR_BY_PROFESSION -> searchDoctorByProfession();
                case DELETE_DOCTOR_BY_ID -> deleteDoctorById();
                case CHANGE_DOCTOR_DATA_BY_ID -> changeDoctorData();
                case ADD_PATIENT -> addPatient();
                case PRINT_ALL_PATIENTS_BY_DOCTOR -> printAllPatientsByDoctor();
                case PRINT_TODAY_PATIENTS -> personStorage.printTodayPatients();
                default -> System.out.println("Wrong command!");
            }
        }
    }

    private static void printAllPatientsByDoctor() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor is id");
        String id = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(id);
        if (doctor != null) {
            personStorage.searchPatientsByDoctor(doctor);
        } else {
            System.out.println("doctor with " + id + " does not exists!");
        }
    }

    private static void addPatient() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor is id");
        String id = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(id);
        if (doctor != null) {
            try {
                System.out.println("Please input id(id card),name,surname,phone,registerDateTime(dd-MM-yyyy HH:mm)");
                String patientDataStr = scanner.nextLine();
                String[] patientData = patientDataStr.split(",");
                Date registerDateTime = DateUtil.stringToDateTime(patientData[4]);
                if (personStorage.isDoctorAvailable(registerDateTime, doctor)) {
                    Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurname(patientData[2]);
                    patient.setPhone(patientData[3]);
                    patient.setDoctor(doctor);
                    patient.setRegisterDateTime(registerDateTime);
                    personStorage.add(patient);
                    System.out.println("Patient registered");
                } else {
                    System.out.println("Doctor is unavailable in that date time, please choose another!");
                }
            } catch (ParseException e) {
                System.out.println("Incorrect registerDate Time. please try again");
            }
        }
    }

    private static void changeDoctorData() {
        personStorage.printDoctors();
        System.out.println("Please enter an ID and press Enter");
        doctorProfession();
        String id = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(id);
        if (doctorById != null) {
            System.out.println("Please input name,surname,email,phoneNumber,profession");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            try {
                doctorById.setName(doctorData[0]);
                doctorById.setSurname(doctorData[1]);
                doctorById.setEmail(doctorData[2]);
                doctorById.setPhone(doctorData[3]);
                doctorById.setProfession(Profession.valueOf(doctorData[4]));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter the details one by one");
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter the data correctly!");
            }
            System.out.println("doctor was updated");
        } else {
            System.out.println("Doctor with " + id + " dose not exists!");
        }
    }

    private static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose id");
        String doctorId = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(doctorId);
        if (doctor != null) {
            personStorage.deleteDoctorById(doctorId);
        } else {
            System.out.println("Wrong id. please try again!");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByProfession(profession);
    }

    private static void addDoctor() {
        System.out.println("Please input id,name,surname,email,phoneNumber,profession");
        doctorProfession();
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor();
            try {
                doctor.setId(doctorId);
                doctor.setName(doctorData[1]);
                doctor.setSurname(doctorData[2]);
                doctor.setEmail(doctorData[3]);
                doctor.setPhone(doctorData[4]);
                doctor.setProfession(Profession.valueOf(doctorData[5]));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter the details one by one");
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter the data correctly!");
            }
            personStorage.add(doctor);
            System.out.println("doctor added");
        } else {
            System.out.println("Doctor with " + doctorId + " already exists");
        }
    }

    private static void doctorProfession() {
        Profession[] doctorProfession = Profession.values();
        System.out.println("Please choose doctor profession");
        for (Profession professions : doctorProfession) {
            System.out.println(professions);
        }
    }
}
