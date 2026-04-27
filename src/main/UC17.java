import java.util.Arrays;

public class UC17 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogies = {
            "Sleeper",
            "AC Chair",
            "First Class",
            "General",
            "Luxury"
        };

        Arrays.sort(bogies);

        System.out.println(
            "Sorted Bogies: " + Arrays.toString(bogies)
        );
    }

    public static void sortNames(String[] arr) {
        Arrays.sort(arr);
    }
}