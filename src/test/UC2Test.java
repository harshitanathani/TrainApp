package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class UC2Test {

    @Test
    public void testBogieList() {
        UC2 obj = new UC2();
        List<String> result = obj.getBogies();

        assertTrue(result.contains("Sleeper"));
        assertFalse(result.contains("AC Chair"));
    }
}