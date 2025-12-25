public class TreatmentRequest {

    int patientID;
    long arrivalTime;
    boolean priority;

    //normal hasta için
    public TreatmentRequest(int patientID) {
        this.patientID = patientID;
        this.arrivalTime = System.currentTimeMillis();
        this.priority = false;
    }

    //acil hasta için
    public TreatmentRequest(int patientID, boolean priority) {
        this.patientID = patientID;
        this.arrivalTime = System.currentTimeMillis();
        this.priority = priority;
    }

}
