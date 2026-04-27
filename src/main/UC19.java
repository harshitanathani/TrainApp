import java.util.Arrays;

public class UC19 {

    public static void main(String[] args) {

        String[] ids = {
            "BG101","BG205","BG309","BG412","BG550"
        };

        String key = "BG412";

        boolean found = binarySearch(ids, key);

        System.out.println("Found: " + found);
    }

    public static boolean binarySearch(
        String[] arr, String key) {

        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = key.compareTo(arr[mid]);

            if (cmp == 0) return true;

            if (cmp > 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return false;
    }
}