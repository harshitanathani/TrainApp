import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UC10Test {

    @Test
    public void testReduce_TotalSeatCalculation() {

        UC10 obj = new UC10();

        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));

        int result = obj.totalCapacity(list);

        assertEquals(128, result);
    }
}