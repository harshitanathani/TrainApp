import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UC7 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> list = new ArrayList<>();

        // Add bogies
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));

        // Sort by capacity
        list.sort(Comparator.comparingInt(b -> b.capacity));

        // Display
        for (Bogie b : list) {
            System.out.println(b.name + " -> Capacity: " + b.capacity);
        }
    }
}