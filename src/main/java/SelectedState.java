public class SelectedState implements VendingMachineState{
    @Override
    public void handleRequest(VendingMachine machine) {
        if (machine.getSelected() == null) {
            System.out.println("Product not found.");
            machine.setState(new ReadyState());
        } else {
            if (machine.getSelected().getQuantity() < 1) {
                System.out.println("Product out of stock. Please make a new selection.");
                machine.setState(new ReadyState());
            } else {
                System.out.println("Product selected.");
                machine.setState(new PaymentState());
            }
        }
    }
}
