public class Main {
    public static void main(String[] args) {


        // test for task1
        System.out.println("************************TASK 1************************");

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
            System.out.println("Patient found: " + found);
        } else {
            System.out.println("Patient not found.");
        }

        System.out.println();

        pat.printList();

        System.out.println();

        System.out.println("************************TASK 2************************");
        System.out.println();

        TreatmentQueue queue = new TreatmentQueue();

        queue.enqueue(new TreatmentRequest(1, 10));
        queue.enqueue(new TreatmentRequest(2, 12));
        queue.enqueue(new TreatmentRequest(3, 14));
        queue.enqueue(new TreatmentRequest(4, 16));
        queue.enqueue(new TreatmentRequest(5, 18));
        queue.enqueue(new TreatmentRequest(6, 20));
        queue.enqueue(new TreatmentRequest(7, 22));
        queue.enqueue(new TreatmentRequest(8, 24));

        System.out.println("\n--- Initial Queue ---");
        queue.printQueue();

        System.out.println("\n--- Processing 3 Treatment Requests ---");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("\n--- Remaining Queue ---");
        queue.printQueue();

        System.out.println("\nRemaining queue size: " + queue.size());

        System.out.println("************************TASK 3************************");

        DischargeStack stack = new DischargeStack();

        stack.push(new DischargeRecord(101));
        stack.push(new DischargeRecord(102));
        stack.push(new DischargeRecord(103));
        stack.push(new DischargeRecord(104));
        stack.push(new DischargeRecord(105));

        System.out.println();

        stack.pop();
        stack.pop();

        System.out.println();

        System.out.println("Remaining Stack: ");
        stack.printStack();

    }
}