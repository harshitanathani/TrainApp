import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC20Test {

    @Test
    public void testSearch_ThrowsExceptionWhenEmpty() {

        String[] arr = {};

        assertThrows(
            IllegalStateException.class,
            () -> UC20.searchBogie(arr, "BG101")
        );
    }

    @Test
    public void testSearch_BogieFoundAfterValidation() {

        String[] arr = {
            "BG101","BG205","BG309"
        };

        assertTrue(
            UC20.searchBogie(arr, "BG205")
        );
    }

    @Test
    public void testSearch_BogieNotFoundAfterValidation() {

        String[] arr = {
            "BG101","BG205","BG309"
        };

        assertFalse(
            UC20.searchBogie(arr, "BG999")
        );
    }

    @Test
    public void testSearch_SingleElementValidCase() {

        String[] arr = {"BG101"};

        assertTrue(
            UC20.searchBogie(arr, "BG101")
        );
    }
}