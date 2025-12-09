public class Main {
    public static void main(String[] args) {
        PatientList pat = new PatientList();

        Patient p1 = new Patient(404,"Eren",4,21);
        Patient p2 = new Patient(123,"Dilay",7,21);
        Patient p3 = new Patient(567,"Taylan",2,13);
        Patient p4 = new Patient(982,"Doğa",5,34);
        Patient p5 = new Patient(543,"Emre",6,27);

        pat.addPatient(p1);
        pat.addPatient(p2);
        pat.addPatient(p3);
        pat.addPatient(p4);
        pat.addPatient(p5);

        System.out.println();

        pat.removePatient(567);
        System.out.println();

        Patient found = pat.findPatient(123);

        if (found != null) {
            System.out.println("Found patient: ID=" + found.id + ", Name=" + found.name);
        } else {
            System.out.println("Patient not found.");
        }

        System.out.println();

        pat.printList();


    }

}