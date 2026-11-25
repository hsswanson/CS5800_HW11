public class DispensingState implements VendingMachineState{
    @Override
    public void handleRequest(VendingMachine machine) {
        System.out.println("Dispensing product:"+machine.getSelected().getName());
        machine.getSelected().setQuantity(machine.getSelected().getQuantity()-1);
        System.out.println(machine.getSelected().getQuantity()+" units of "+machine.getSelected().getName()+" remain.");
        machine.setState(new ReadyState());
    }


}
