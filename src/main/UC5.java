import java.util.LinkedHashSet;

public class UC5 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate
        train.add("Sleeper");

        // Print final
        System.out.println("Train Formation: " + train);
    }
}