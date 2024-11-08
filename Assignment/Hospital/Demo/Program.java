package Demo;

import hospital.InHousePatient;
import hospital.Patient;

public class Program {
    
    public static void main(String[] args) {
    
        InHousePatient patient1 = new InHousePatient(1, "OMPIDI", 1, 30);
        Patient patient2 = new Patient(2, "SHREEPAD", 2, 25);

        System.out.println("In-house patient details:");
        System.out.println("Patient ID: " + patient1.getpId());
        System.out.println("Patient Name: " + patient1.getpName());
        System.out.println("Bed Type: " + patient1.getBedType());
        System.out.println("Number of days: " + patient1.getNoOfDays());
        System.out.println("Bill Amount: " + patient1.getBillAmount());

        System.out.println("\nOut-patient details:");
        System.out.println("Patient ID: " + patient2.getpId());

    }
}
