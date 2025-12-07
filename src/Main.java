public class Main {
    public static void main(String[] args) {

        PatientList list = new PatientList();

        list.addPatient(new Patient(1, "Eren", 4, 21));
        list.addPatient(new Patient(2, "Dilay",7 , 21));
        list.addPatient(new Patient(3, "Taylan", 3, 32));
        list.addPatient(new Patient(4, "Doğa", 9, 45));
        list.addPatient(new Patient(5, "Emre", 5, 14));

        list.removePatient(3);

        Patient pat = list.findPatient(2);
        if (pat != null) {
            System.out.println("Finded: " + pat.name);
        }

        System.out.println("Final List:");
        list.printList();
    }
}
