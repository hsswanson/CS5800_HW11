public class SelectedState implements VendingMachineState{
    @Override
    public void handleRequest(VendingMachine machine) {
        if (machine.getSelected() == null) {
            System.out.println("Product not found.");
            machine.setState(new ReadyState());
        } else {
            if (machine.getSelected().getQuantity() < 1) {
                machine.setState(new OutOfStockState());
            } else {
                System.out.println("Product selected.");
                machine.setState(new PaymentState());
            }
        }
    }
}
