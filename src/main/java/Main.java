public class Main {
    static void main() {
        IO.println("CS5800_HW11_hsswanson");

        VendingMachine machine = new VendingMachine();
        System.out.println("I have $20. I want two snickers, all of the KitKats I can afford, and one of everything else.");
        machine.insertMoney(20.0);
        machine.displayBalance();

        machine.selectSnack("Coke");
        machine.handleRequests();
        machine.selectSnack("Pepsi");
        machine.handleRequests();
        machine.selectSnack("Doritos");
        machine.handleRequests();
        machine.selectSnack("Cheetos");
        machine.handleRequests();


        machine.selectSnack("Snickers");
        machine.handleRequests();
        machine.selectSnack("Snickers");
        machine.handleRequests();
        while(machine.getBalance()>=1.50){
            machine.selectSnack("KitKat");
            machine.handleRequests();
        }

    }
}
