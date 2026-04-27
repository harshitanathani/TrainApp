import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC16Test {

    @Test
    public void testSort_BasicSorting() {

        int[] arr = {72, 56, 24, 70, 60};

        UC16.bubbleSort(arr);

        assertArrayEquals(
            new int[]{24, 56, 60, 70, 72},
            arr
        );
    }

    @Test
    public void testSort_AlreadySortedArray() {

        int[] arr = {24, 56, 60, 70, 72};

        UC16.bubbleSort(arr);

        assertArrayEquals(
            new int[]{24, 56, 60, 70, 72},
            arr
        );
    }

    @Test
    public void testSort_DuplicateValues() {

        int[] arr = {72, 56, 56, 24};

        UC16.bubbleSort(arr);

        assertArrayEquals(
            new int[]{24, 56, 56, 72},
            arr
        );
    }

    @Test
    public void testSort_SingleElementArray() {

        int[] arr = {50};

        UC16.bubbleSort(arr);

        assertArrayEquals(
            new int[]{50},
            arr
        );
    }
}