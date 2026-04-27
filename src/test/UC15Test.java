import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC15Test {

    @Test
    public void testCargo_SafeAssignment() {

        GoodsWagon g = new GoodsWagon("Cylindrical");
        g.assignCargo("Petroleum");

        assertEquals("Petroleum", g.cargo);
    }

    @Test
    public void testCargo_UnsafeAssignmentHandled() {

        GoodsWagon g = new GoodsWagon("Rectangular");
        g.assignCargo("Petroleum");

        assertNull(g.cargo);
    }

    @Test
    public void testCargo_CargoNotAssignedAfterFailure() {

        GoodsWagon g = new GoodsWagon("Rectangular");
        g.assignCargo("Petroleum");

        assertNull(g.cargo);
    }

    @Test
    public void testCargo_ProgramContinuesAfterException() {

        GoodsWagon g1 = new GoodsWagon("Rectangular");
        g1.assignCargo("Petroleum");

        GoodsWagon g2 = new GoodsWagon("Open");
        g2.assignCargo("Coal");

        assertEquals("Coal", g2.cargo);
    }
}