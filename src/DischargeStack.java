public class DischargeStack {

    public class Node {
        DischargeRecord record;
        Node next;

        Node(DischargeRecord r) {
            record = r;
            next = null; // reference to next node
        }
    }

    Node top; //top of the stack

    public DischargeStack() {
        top = null;
    }

    void push(DischargeRecord record) { // it adds new record to the stack
        Node newNode = new Node(record);
        newNode.next = top;
        top = newNode;
        System.out.println(record + " Pushed to the stack");
    }

    void pop() { // it removes the top record from the stack
        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println(top.record + " Popped from the stack");
            top = top.next;
        }
    }

    public DischargeRecord peek() { // it returns the top record
        if (isEmpty()) {
            System.out.println("The queue is empty");
        }
        return top.record;
    }

    public void printStack() { // it prints all records in the stack
        while (!isEmpty()) {
            System.out.println("PatientID: " + top.record.patientId + ", DischargeTime: " + top.record.dischargeTime);
            top = top.next;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }


}
