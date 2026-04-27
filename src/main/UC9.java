import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UC9 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> list = new ArrayList<>();

        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("Sleeper", 70));
        list.add(new Bogie("First Class", 24));

        // Grouping
        Map<String, List<Bogie>> grouped =
                list.stream().collect(Collectors.groupingBy(b -> b.name));

        // Print
        for (String key : grouped.keySet()) {
            System.out.println(key + " -> " + grouped.get(key).size());
        }
    }

    // method for test
    public Map<String, List<Bogie>> groupBogies(List<Bogie> list) {
        return list.stream().collect(Collectors.groupingBy(b -> b.name));
    }
}