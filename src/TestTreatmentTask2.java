public class TestTreatmentTask2 {
    public static void main(String[] args) {

        TreatmentQueue queue = new TreatmentQueue();

        queue.enqueue(new TreatmentRequest(123, 10));
        queue.enqueue(new TreatmentRequest(124, 12));
        queue.enqueue(new TreatmentRequest(125, 14));
        queue.enqueue(new TreatmentRequest(126, 16));
        queue.enqueue(new TreatmentRequest(127, 18));
        queue.enqueue(new TreatmentRequest(128, 20));
        queue.enqueue(new TreatmentRequest(129, 22));
        queue.enqueue(new TreatmentRequest(130, 24));

        System.out.println();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println();

        queue.printQueue();

    }
}
