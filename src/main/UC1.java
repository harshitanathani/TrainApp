import java.util.ArrayList;
import java.util.List;

public class UC1 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> train = new ArrayList<>();

        System.out.println("Initial bogie count: " + train.size());
    }

    // method for testing
    public int getInitialCount() {
        List<String> train = new ArrayList<>();
        return train.size();
    }
}