public class PatientList {

    public class Node {
        Patient info;
        Node next;

        Node(Patient p) {
            this.info = p;
            this.next = null;
        }
    }

    Node head;

    void addPatient(Patient p) {
        Node newNode = new Node(p);

        if (head == null) {
            head = newNode;
            System.out.println("Patient added successfully.");
        } else {
            Node temp = head; //traverse to the end of the list
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            System.out.println("Patient added successfully.");
        }
    }

    void removePatient(int id) {

        if (head == null) {
            System.out.println("Patient not found.");
        } else if (head.info.id == id) {
            head = head.next;
            System.out.println("Patient removed successfully.");
            return;
        }
        Node temp = head; //search for the patient in the list
        Node temp2 = head.next;

        while (temp.next != null && temp.info.id != id) {
            temp2 = temp;
            temp = temp.next;
        }
        if (temp != null) {
            temp2.next = temp.next;
            System.out.println("Patient removed successfully.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    Patient findPatient(int id) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.info != null && temp.info.id == id) {
                return temp.info;
            }
            temp = temp.next;
        }
        return null;
    }

    void printList() {
        if (head == null) {
            System.out.println("List is empty.");
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.info);
            temp = temp.next;
        }
    }

    public void sortBySeverity() { //bubble sort
        if (head == null) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.info.severity < current.next.info.severity) {
                    Patient temp = current.info;
                    current.info = current.next.info;
                    current.next.info = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

}