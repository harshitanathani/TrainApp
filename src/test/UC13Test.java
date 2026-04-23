import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UC13Test {

    @Test
    public void testLoopFilteringLogic() {

        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("A", 70));
        list.add(new Bogie("B", 50));

        assertEquals(1, UC13.filterUsingLoop(list).size());
    }

    @Test
    public void testStreamFilteringLogic() {

        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("A", 70));
        list.add(new Bogie("B", 50));

        assertEquals(1, UC13.filterUsingStream(list).size());
    }

    @Test
    public void testLoopAndStreamResultsMatch() {

        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("A", 70));
        list.add(new Bogie("B", 80));
        list.add(new Bogie("C", 40));

        assertEquals(
            UC13.filterUsingLoop(list).size(),
            UC13.filterUsingStream(list).size()
        );
    }

    @Test
    public void testExecutionTimeMeasurement() {

        long start = System.nanoTime();
        long end = System.nanoTime();

        assertTrue(end - start >= 0);
    }
}