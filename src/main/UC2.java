import java.util.ArrayList;
import java.util.List;

public class UC2 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list
        List<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Print after adding
        System.out.println("After adding bogies: " + bogies);

        // Remove one bogie
        bogies.remove("AC Chair");

        // Check existence
        boolean exists = bogies.contains("Sleeper");
        System.out.println("Does Sleeper exist? " + exists);

        // Final list
        System.out.println("Final bogie list: " + bogies);
    }

    // method for testing
    public List<String> getBogies() {
        List<String> bogies = new ArrayList<>();
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        bogies.remove("AC Chair");

        return bogies;
    }
}