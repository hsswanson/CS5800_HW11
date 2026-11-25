public class OutOfStockState implements VendingMachineState{
    @Override
    public void handleRequest(VendingMachine machine) {
        System.out.println("Out of stock. Please make another Selection.");
        machine.setState(new ReadyState());
    }
}
