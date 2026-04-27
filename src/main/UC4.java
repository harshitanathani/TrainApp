import java.util.LinkedList;

public class UC4 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Insert Pantry at position 2
        train.add(2, "Pantry");

        // Remove first and last
        train.removeFirst();
        train.removeLast();

        // Final list
        System.out.println("Final Train Consist: " + train);
    }
}