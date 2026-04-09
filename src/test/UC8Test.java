import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UC8Test {

    @Test
    public void testFilter_CapacityGreaterThanThreshold() {

        UC8 obj = new UC8();

        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));

        List<Bogie> result = obj.filterBogies(list);

        assertEquals(1, result.size());
        assertEquals("Sleeper", result.get(0).name);
    }

    @Test
    public void testFilter_NoBogiesMatching() {

        UC8 obj = new UC8();

        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("AC Chair", 50));
        list.add(new Bogie("First Class", 40));

        List<Bogie> result = obj.filterBogies(list);

        assertTrue(result.isEmpty());
    }
}