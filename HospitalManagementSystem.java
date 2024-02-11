package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    String name;
    int age;
    String gender;
    String address;
    String contact;

    public Patient(String name, int age, String gender, String address, String contact) {
    	super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.contact = contact;
    }
}

public class HospitalManagementSystem {
    private ArrayList<Patient> patients;

    public HospitalManagementSystem() {
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
        System.out.println("Patient added successfully.");
    }

    public void displayPatients() {
        System.out.println("\nList of Patients:");
        for (int i = 0; i < patients.size(); i++) {
            Patient patient = patients.get(i);
            System.out.println((i + 1) + ". " + patient.name + ", " + patient.age + " years, " + patient.gender);
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	System.out.println("\n*******************************************************");
            System.out.println("\n********Hospital Management System Menu:*************");
            System.out.println("1. .........Add Patient Information....................");
            System.out.println("2.......... Display Patients...........................");
            System.out.println("3.......... Exit the Information ......................");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                	
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter patient gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter patient address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter patient contact number: ");
                    String contact = scanner.nextLine();

                    Patient patient = new Patient(name, age, gender, address, contact);
                    addPatient(patient);
                    break;

                case "2":
                    displayPatients();
                    break;

                case "3":
                    System.out.println("Exiting Hospital Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        HospitalManagementSystem hospitalSystem = new HospitalManagementSystem();
        hospitalSystem.run();
    }
}
