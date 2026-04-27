import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC11Test {

    @Test
    public void testRegex_ValidTrainID() {
        assertTrue(UC11.validateTrainId("TRN-1234"));
    }

    @Test
    public void testRegex_InvalidTrainIDFormat() {
        assertFalse(UC11.validateTrainId("TRAIN12"));
        assertFalse(UC11.validateTrainId("TRN12A"));
    }

    @Test
    public void testRegex_ValidCargoCode() {
        assertTrue(UC11.validateCargoCode("PET-AB"));
    }

    @Test
    public void testRegex_InvalidCargoCodeFormat() {
        assertFalse(UC11.validateCargoCode("PET-ab"));
        assertFalse(UC11.validateCargoCode("PET123"));
    }
}