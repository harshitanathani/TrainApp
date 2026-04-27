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

public class UC13 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> list = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            list.add(new Bogie("Bogie" + i, i % 100));
        }

        // Loop timing
        long startLoop = System.nanoTime();
        List<Bogie> loopResult = filterUsingLoop(list);
        long endLoop = System.nanoTime();

        // Stream timing
        long startStream = System.nanoTime();
        List<Bogie> streamResult = filterUsingStream(list);
        long endStream = System.nanoTime();

        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Loop Time: " + (endLoop - startLoop) + " ns");

        System.out.println("Stream Result Size: " + streamResult.size());
        System.out.println("Stream Time: " + (endStream - startStream) + " ns");
    }

    public static List<Bogie> filterUsingLoop(List<Bogie> list) {
        List<Bogie> result = new ArrayList<>();

        for (Bogie b : list) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }

        return result;
    }

    public static List<Bogie> filterUsingStream(List<Bogie> list) {
        return list.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }
}