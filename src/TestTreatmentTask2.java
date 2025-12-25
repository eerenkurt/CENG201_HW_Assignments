public class TestTreatmentTask2 {
    public static void main(String[] args) {

        TreatmentQueue queue = new TreatmentQueue();

        queue.enqueue(new TreatmentRequest(123,false ));
        queue.enqueue(new TreatmentRequest(124,false ));
        queue.enqueue(new TreatmentRequest(125,false ));
        queue.enqueue(new TreatmentRequest(126,false ));
        queue.enqueue(new TreatmentRequest(127,false ));
        queue.enqueue(new TreatmentRequest(128,true ));
        queue.enqueue(new TreatmentRequest(129,true ));
        queue.enqueue(new TreatmentRequest(130,true ));

        System.out.println();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println();

        queue.printQueue();

    }
}
