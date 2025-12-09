public class PatientList  {

    public class Node{
        Patient info;
        Node next;

        Node(Patient p){
            this.info = p;
            this.next = null;
        }

    }
    private Node head = null;

    public void addPatient(Patient p){
        Node newNode = new Node(p);

        if (head == null) {
            head = newNode;
            System.out.println("Patient added.");
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        System.out.println("Patient added.");
    }

    public void removePatient(int id){
        if (head == null){
            System.out.println("Patient list is empty.");
            return;
        }
        if(head.info.id == id){
            head = head.next;
            System.out.println("Patient ID: " + id + "removed.");
            return;
        }
        Node curr = head;
        Node prev = null;

        while (curr != null && curr.info.id !=id){
            prev = curr;
            curr = curr.next;

        }
        if ( curr == null){
            System.out.println("Patient ID: "+ id+"is not exist.");
            return;
        }
        prev.next = curr.next;
        System.out.println("Patient ID: "+ id+ " removed.");
    }

    public Patient findPatient(int id){
        Node curr = head;

        while (curr != null){
            if(curr.info != null && curr.info.id == id){
                return  curr.info;
            }
            curr = curr.next;
        }
        return null;

    }
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node curr = head;
        while (curr != null) {
            Patient p = curr.info;
            System.out.println("ID: " + p.id + ", Name: " + p.name + ", Severity: " + p.severity + ", Age: " + p.age);
            curr = curr.next;
        }
    }

}