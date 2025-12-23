public class TestPatientTask1 {
    public static void main(String[] args) {

        PatientList pat = new PatientList();

        Patient p1 = new Patient(123,"Eren",4,21);
        Patient p2 = new Patient(124,"Dilay",7,21);
        Patient p3 = new Patient(125,"Taylan",2,13);
        Patient p4 = new Patient(126,"Doğa",5,34);
        Patient p5 = new Patient(127,"Emre",6,27);

        pat.addPatient(p1);
        pat.addPatient(p2);
        pat.addPatient(p3);
        pat.addPatient(p4);
        pat.addPatient(p5);

        System.out.println();

        pat.removePatient(125);
        System.out.println();

        Patient found = pat.findPatient(124);

        if (found != null) {
            System.out.println("Patient found: " + found);
        } else {
            System.out.println("Patient not found.");
        }

        System.out.println();

        pat.printList();
    }
}
