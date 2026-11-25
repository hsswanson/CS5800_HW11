import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class VendingMachineTest {
    VendingMachine machine = new VendingMachine();
    Snack snack;
    @Test
    public void testMachine(){
        machine.handleRequest();
        machine.selectSnack("Snickers");
        machine.handleRequest();
        machine.handleRequest();
        assertEquals(0.0, machine.getBalance());

        machine.insertMoney(10.0);
        assertEquals(10.0, machine.getBalance());

        machine.handleRequest();        //awaiting selection
        machine.selectSnack("Coke");
        machine.handleRequest();        //product selected
        snack = machine.getSelected();
        machine.handleRequest();        //payment processing
        machine.handleRequest();        //dispensing product
        assertEquals(4,snack.getQuantity());
        assertEquals(10.0-snack.getPrice(), machine.getBalance());

        machine.handleRequest(); //awaiting selection
        assertNull(machine.getSelected());

        machine.selectSnack("Snickers");
        machine.handleRequest();        //product selected
        snack= machine.getSelected();
        machine.handleRequest();        //payment processing
        machine.handleRequest();        //dispensing product
        assertEquals(0, snack.getQuantity());
        assertEquals(8-snack.getPrice(), machine.getBalance());
        machine.handleRequest();        //awaiting selection
        machine.selectSnack("Snickers");
        machine.handleRequest();;       //out of stock

        machine.handleRequest();    //awaiting selection
        machine.selectSnack("Butterfingers");
        machine.handleRequest();        //product not found
        assertNull(machine.getSelected());
        machine.handleRequest();        //awaiting selection



    }

}
