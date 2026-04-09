import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UC9Test {

    @Test
    public void testGrouping_BogiesGroupedByType() {

        UC9 obj = new UC9();

        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("Sleeper", 70));

        Map<String, List<Bogie>> result = obj.groupBogies(list);

        assertEquals(2, result.get("Sleeper").size());
    }
}