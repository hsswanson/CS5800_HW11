public class VendingMachine {
    private VendingMachineState state;
    private SnackDispenser dispenser;
    private Snack selected;
    private double balance;

    public VendingMachine(){
        state = new ReadyState();
        dispenser = new SnackDispenser(new Coke(), new SnackDispenser(new Pepsi(), new SnackDispenser(new Cheetos(), new SnackDispenser(new Doritos(), new SnackDispenser(new KitKat(),new SnackDispenser(new Snickers()))))));

    }

    public void handleRequest(){
        state.handleRequest(this);
    }
    public void setState(VendingMachineState state){
        this.state = state;
    }

    public void selectSnack(String name){
        selected = dispenser.handleRequest(name);
        this.state = new SelectedState();
    }

    public void insertMoney(double payment){
        balance = payment;
    }



    public Snack getSelected(){
        return selected;
    }
    public void clearSelected(){
        selected = null;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }


}
