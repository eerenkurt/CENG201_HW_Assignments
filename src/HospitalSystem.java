import java.util.HashMap;

public class HospitalSystem {

    private PatientList patientList;
    private TreatmentQueue treatmentQueue;
    private DischargeStack dischargeStack;
    private HashMap<Integer, Patient> patientMap;

    public HospitalSystem() {
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>();
    }

    public void addPatient(Patient patient) { //patient added to list and hash map
        patientList.addPatient(patient);
        patientMap.put(patient.id, patient);
    }


    public void addTreatmentRequest(int patientId, boolean acil) { // acil kept for future priority extensions

        TreatmentRequest request = new TreatmentRequest(patientId, System.currentTimeMillis());
        treatmentQueue.enqueue(request);
    }

    public void processTreatment() {
        TreatmentRequest request = treatmentQueue.dequeue(); //gets the next patient from the treatment queue

        if (request != null) {
            dischargeStack.push(new DischargeRecord(request.patientID));
            patientList.removePatient(request.patientID);
            patientMap.remove(request.patientID);
        }
    }

    public void sortPatientsBySeverity() {
        patientList.sortBySeverityDescending();
    }

    public void printSystemState() {
        System.out.println("Patients:");
        patientList.printList();

        System.out.println("\nTreatment Queue:");
        treatmentQueue.printQueue();

        System.out.println("\nDischarge Stack:");
        dischargeStack.printStack();
    }
}


