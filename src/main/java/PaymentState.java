public class PaymentState implements VendingMachineState{
    @Override
    public void handleRequest(VendingMachine machine) {
        if (machine.getBalance() < machine.getSelected().getPrice()) {
            System.out.print("Cost:"+machine.getSelected().getPrice()+". ");
            System.out.print("Current balance:"+machine.getBalance()+". ");
            System.out.println("Refunding balance and returning to selection.");
            machine.setBalance(0.0);
            machine.setState(new ReadyState());
        } else {
            System.out.println("Payment processing.");
            machine.setBalance(machine.getBalance()-machine.getSelected().getPrice());
            machine.setState(new DispensingState());
        }
    }


}
