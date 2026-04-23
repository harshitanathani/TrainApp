import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UC12Test {

    @Test
    public void testSafety_AllBogiesValid() {

        List<GoodsBogie> list = new ArrayList<>();
        list.add(new GoodsBogie("Cylindrical", "Petroleum"));
        list.add(new GoodsBogie("Open", "Coal"));

        assertTrue(UC12.isSafetyCompliant(list));
    }

    @Test
    public void testSafety_CylindricalWithInvalidCargo() {

        List<GoodsBogie> list = new ArrayList<>();
        list.add(new GoodsBogie("Cylindrical", "Coal"));

        assertFalse(UC12.isSafetyCompliant(list));
    }

    @Test
    public void testSafety_EmptyBogieList() {

        List<GoodsBogie> list = new ArrayList<>();

        assertTrue(UC12.isSafetyCompliant(list));
    }
}