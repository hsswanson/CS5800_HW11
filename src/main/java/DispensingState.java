public class DispensingState implements VendingMachineState{
    @Override
    public void handleRequest(VendingMachine machine) {
        System.out.println("Dispensing product.");
        machine.getSelected().setQuantity(machine.getSelected().getQuantity()-1);
        machine.setState(new ReadyState());
    }


}
