import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SnackDispenserTest {

    @Test
    public void testDispenser(){

        SnackDispenser dispenser = new SnackDispenser(new Coke(), new SnackDispenser(new Pepsi()));
        Snack handled =dispenser.handleRequest("Pepsi");
        assertEquals(new Pepsi().getName(), handled.getName());

        handled = dispenser.handleRequest("KitKat");
        assertNull(handled);
    }
}
