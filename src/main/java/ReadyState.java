public class ReadyState implements VendingMachineState{
    @Override
    public void handleRequest(VendingMachine machine) {
        machine.clearSelected();
        System.out.println("Awaiting selection.");

    }
}
