public class TreatmentQueue {

    public class Node {
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

    void enqueue(TreatmentRequest request) { //adds a treatment request to end of the queue
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
        TreatmentRequest result = front.request; //removes the front element
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

    boolean isEmpty() { //checks if the queue is empty
        return size == 0;
    }

    public void printQueue() {
        Node current = front;

        while (current != null) {
            System.out.println("PatientID: " + current.request.patientID +
                    ", ArrivalTime: " + current.request.arrivalTime);
            current = current.next;
        }
    }


}


