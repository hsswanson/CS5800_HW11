public class Main {
    static void main() {
        IO.println("CS5800_HW11_hsswanson");

        VendingMachine machine = new VendingMachine();
        System.out.println("I have $10. I want a coke, two snickers, and all of the KitKats I can afford.");
        machine.insertMoney(10.0);
        machine.displayBalance();
        machine.selectSnack("Coke");
        machine.handleRequests();
        machine.selectSnack("Snickers");
        machine.handleRequests();
        machine.selectSnack("Snickers");
        machine.handleRequests();
        while(machine.getBalance()>1.50){
            machine.selectSnack("KitKat");
            machine.handleRequests();
        }

    }
}
