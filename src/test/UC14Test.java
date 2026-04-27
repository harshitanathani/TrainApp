import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC14Test {

    @Test
    public void testException_ValidCapacityCreation() throws Exception {

        PassengerBogie b = new PassengerBogie("Sleeper", 72);

        assertEquals("Sleeper", b.type);
        assertEquals(72, b.capacity);
    }

    @Test
    public void testException_NegativeCapacityThrowsException() {

        Exception e = assertThrows(
            InvalidCapacityException.class,
            () -> new PassengerBogie("AC", -10)
        );

        assertEquals(
            "Capacity must be greater than zero",
            e.getMessage()
        );
    }

    @Test
    public void testException_ZeroCapacityThrowsException() {

        assertThrows(
            InvalidCapacityException.class,
            () -> new PassengerBogie("AC", 0)
        );
    }

    @Test
    public void testException_ObjectIntegrityAfterCreation() throws Exception {

        PassengerBogie b = new PassengerBogie("First Class", 24);

        assertEquals("First Class", b.type);
        assertEquals(24, b.capacity);
    }
}