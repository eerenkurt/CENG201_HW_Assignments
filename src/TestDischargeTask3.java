public class TestDischargeTask3 {
    public static void main(String[] args) {

        DischargeStack stack = new DischargeStack();

        stack.push(new DischargeRecord(123));
        stack.push(new DischargeRecord(124));
        stack.push(new DischargeRecord(125));
        stack.push(new DischargeRecord(126));
        stack.push(new DischargeRecord(127));

        System.out.println();

        stack.pop();
        stack.pop();

        System.out.println();

        System.out.println("Remaining Stack: ");
        stack.printStack();
    }
}
