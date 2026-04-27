import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UC11 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        boolean trainValid = validateTrainId(trainId);
        boolean cargoValid = validateCargoCode(cargoCode);

        System.out.println("Train ID " + trainId + " Valid: " + trainValid);
        System.out.println("Cargo Code " + cargoCode + " Valid: " + cargoValid);
    }

    public static boolean validateTrainId(String trainId) {
        Pattern pattern = Pattern.compile("TRN-\\d{4}");
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    public static boolean validateCargoCode(String cargoCode) {
        Pattern pattern = Pattern.compile("PET-[A-Z]{2}");
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }
}