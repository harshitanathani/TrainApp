import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC1Test {

    @Test
    public void testInitialCount() {
        UC1 obj = new UC1();
        assertEquals(0, obj.getInitialCount());
    }
}