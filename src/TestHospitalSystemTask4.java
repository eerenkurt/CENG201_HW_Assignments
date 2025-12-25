public class TestHospitalSystemTask4 {

    public static void main(String[] args) {

        HospitalSystem system = new HospitalSystem();

        system.addPatient(new Patient(123, "eren", 3, 21));
        system.addPatient(new Patient(124, "dilay", 5, 21));
        system.addPatient(new Patient(125, "taylan", 7, 13));
        system.addPatient(new Patient(126, "doğa", 9, 54));
        system.addPatient(new Patient(127, "lara", 1, 21));
        system.addPatient(new Patient(128, "salih", 9, 66));
        system.addPatient(new Patient(129, "su", 4, 45));
        system.addPatient(new Patient(130, "furkan", 2, 27));
        system.addPatient(new Patient(131, "umut", 10, 78));
        system.addPatient(new Patient(132, "yusuf", 8, 11));

        System.out.println();

        system.addTreatmentRequest(123, false);
        system.addTreatmentRequest(124, false);
        system.addTreatmentRequest(125, false);
        system.addTreatmentRequest(126, false);
        system.addTreatmentRequest(127, false);

        system.addTreatmentRequest(128, true);
        system.addTreatmentRequest(129, true);
        system.addTreatmentRequest(130, true);

        System.out.println();

        system.sortPatientsBySeverity();

        System.out.println();

        system.processTreatment();
        system.processTreatment();
        system.processTreatment();
        system.processTreatment();

        System.out.println();

        system.printSystemState();
    }
}
