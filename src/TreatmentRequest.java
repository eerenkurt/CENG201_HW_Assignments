public class TreatmentRequest {

    int patientID;
    long arrivalTime;

    public TreatmentRequest(int patientID, long arrivalTime) {
        this.patientID = patientID;
        this.arrivalTime = System.currentTimeMillis();
    }
}
