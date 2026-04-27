public class UC18 {

    public static void main(String[] args) {

        String[] ids = {
            "BG101","BG205","BG309","BG412","BG550"
        };

        String key = "BG309";

        boolean found = linearSearch(ids, key);

        System.out.println("Found: " + found);
    }

    public static boolean linearSearch(
        String[] arr, String key) {

        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}