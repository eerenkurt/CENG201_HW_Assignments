public class TreatmentQueue {

    private class Node {
        TreatmentRequest request;
        Node next;

        public Node(TreatmentRequest request) {
            this.request = request;
            this.next = null;
        }
    }

    Node front;
    Node rear;
    int size;

    public TreatmentQueue() {
        front = null;
        rear = null;
        size = 0;
    }
    //FIFO mantığı var queuelarda
    void enqueue(TreatmentRequest request) { //sıranın sonuna ekler
        Node newNode = new Node(request);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            System.out.println("The patient added to the queue");
        } else {
            rear.next = newNode;
            rear = newNode;
            System.out.println("The patient added to the queue");
        }
        size++;
    }

    public TreatmentRequest dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return null;
        }
        System.out.println("The patient removed from the queue");
        TreatmentRequest result = front.request; //baştaki elemanı siler
        front = front.next;
        size--;

        if (isEmpty()) {
            rear = null;
        }
        return result;
    }

    public int size() {
        return size;
    }

    boolean isEmpty() { //queue boş mu diye bakıyor
        return size == 0;
    }

    public void printQueue() {
        Node current = front;

        while (current != null) {
            System.out.println("PatientID: " + current.request.patientID + ", ArrivalTime: " + current.request.arrivalTime);
            current = current.next;
        }
    }


}


