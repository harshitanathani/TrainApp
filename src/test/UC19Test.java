import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC19Test {

    @Test
    public void testBinarySearch_BogieFound() {

        String[] arr = {
            "BG309","BG101","BG550"
        };

        assertTrue(
            UC19.binarySearch(arr, "BG101")
        );
    }

    @Test
    public void testBinarySearch_NotFound() {

        String[] arr = {
            "BG309","BG101","BG550"
        };

        assertFalse(
            UC19.binarySearch(arr, "BG999")
        );
    }
}