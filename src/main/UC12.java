import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class UC12 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<GoodsBogie> list = new ArrayList<>();

        list.add(new GoodsBogie("Cylindrical", "Petroleum"));
        list.add(new GoodsBogie("Open", "Coal"));
        list.add(new GoodsBogie("Box", "Grain"));

        boolean safe = isSafetyCompliant(list);

        System.out.println("Train Safety Compliant: " + safe);
    }

    public static boolean isSafetyCompliant(List<GoodsBogie> list) {

        return list.stream().allMatch(b ->
                !b.type.equals("Cylindrical")
                || b.cargo.equals("Petroleum")
        );
    }
}