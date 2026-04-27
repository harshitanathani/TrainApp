import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC18Test {

    @Test
    public void testSearch_BogieFound() {

        String[] arr = {
            "BG101","BG205","BG309"
        };

        assertTrue(
            UC18.linearSearch(arr, "BG309")
        );
    }

    @Test
    public void testSearch_BogieNotFound() {

        String[] arr = {
            "BG101","BG205","BG309"
        };

        assertFalse(
            UC18.linearSearch(arr, "BG999")
        );
    }
}