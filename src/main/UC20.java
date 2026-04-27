public class UC20 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogies = {"BG101", "BG205", "BG309"};

        try {

            boolean found = searchBogie(bogies, "BG205");

            System.out.println("Search Result: " + found);

        } catch (IllegalStateException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

    public static boolean searchBogie(
        String[] arr, String key) {

        if (arr.length == 0) {

            throw new IllegalStateException(
                "Train has no bogies to search."
            );
        }

        for (String id : arr) {

            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}