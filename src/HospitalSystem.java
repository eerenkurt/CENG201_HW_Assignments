import java.util.HashMap;

public class HospitalSystem {

    private PatientList patientList;
    private TreatmentQueue normalQueue;
    private TreatmentQueue priorityQueue;
    private DischargeStack dischargeStack;
    private HashMap<Integer, Patient> patientMap;

    public HospitalSystem() {
        patientList = new PatientList();
        normalQueue = new TreatmentQueue();
        priorityQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>();
    }

    public void addPatient(Patient patient) { //patient listeye ve hash map e eklenir
        patientList.addPatient(patient);
        patientMap.put(patient.id, patient);
    }

    public void addTreatmentRequest(int patientId, boolean priority) {

        if (patientMap.containsKey(patientId) == false) {
            System.out.println("Patient not found");
        }
        TreatmentRequest request = new TreatmentRequest(patientId, priority);
        if (priority == true) {
            priorityQueue.enqueue(request);
        } else {
            normalQueue.enqueue(request);
        }
    }

    public void processTreatment() {

        TreatmentRequest request;
        if (priorityQueue.size() > 0) {
            request = priorityQueue.dequeue();
        } else {
            request = normalQueue.dequeue();
        }
        if (request != null) {
            dischargeStack.push(new DischargeRecord(request.patientID));
            patientList.removePatient(request.patientID);
            patientMap.remove(request.patientID);
        }
    }
    public void addDischargeRecord(int patientId) {
        dischargeStack.push(new DischargeRecord(patientId));
    }

    public void sortPatientsBySeverity() {
        patientList.sortBySeverity();
    }

    public void printSystemState() {
        System.out.println("Patients: ");
        patientList.printList();

        System.out.println("\nPriority Treatment Queue: ");
        priorityQueue.printQueue();

        System.out.println("\nNormal Treatment Queue: ");
        normalQueue.printQueue();

        System.out.println("\nDischarge Stack: ");
        dischargeStack.printStack();
    }
}


