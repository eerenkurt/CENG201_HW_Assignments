public class DischargeStack {

    public class Node {
        DischargeRecord record;
        Node next;

        Node(DischargeRecord r) {
            record = r;
            next = null;
        }
    }

    Node top; //stackin en üstündeki değerii tutar

    public DischargeStack() {
        top = null;
    }
    //LIFO mantığı var stackte
    void push(DischargeRecord record) {
        Node newNode = new Node(record);
        newNode.next = top;
        top = newNode;
        System.out.println(record + " Pushed to the stack");
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println(top.record + " Popped from the stack");
            top = top.next;
        }
    }

    public DischargeRecord peek() { //toptakini gösteriyor
        if (isEmpty()) {
            System.out.println("The queue is empty");
        }
        return top.record;
    }

    public void printStack() {
        while (!isEmpty()) {
            System.out.println("PatientID: " + top.record.patientId + ", DischargeTime: " + top.record.dischargeTime);
            top = top.next;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }


}
