public class PatientList {

    class Node {
        Patient patient;
        Node next;

        Node(Patient p) {
            this.patient = p;
            this.next = null;
        }
    }

    Node head = null;

    public void addPatient(Patient p) {
        Node newNode = new Node(p);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void removePatient(int id) {
        if (head == null) return;

        if (head.patient.id == id) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node previous = null;

        while (temp != null && temp.patient.id != id) {
            previous = temp;
            temp = temp.next;
        }

        if (temp != null) {
            previous.next = temp.next;
        }
    }

    public Patient findPatient(int id) {
        Node temp = head;

        while (temp != null) {
            if (temp.patient.id == id)
                return temp.patient;

            temp = temp.next;
        }

        return null;
    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.println("ID: " + temp.patient.id +
                    ", Name: " + temp.patient.name +
                    ", Severity: " + temp.patient.severity +
                    ", Age: " + temp.patient.age);
            temp = temp.next;
        }
    }
}
