class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsWagon {
    String shape;
    String cargo;

    GoodsWagon(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {

        try {

            if (shape.equals("Rectangular") &&
                cargo.equals("Petroleum")) {

                throw new CargoSafetyException(
                    "Unsafe cargo assignment!"
                );
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo);

        } catch (CargoSafetyException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Assignment process completed.");
        }
    }
}

public class UC15 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        GoodsWagon g1 = new GoodsWagon("Cylindrical");
        g1.assignCargo("Petroleum");

        GoodsWagon g2 = new GoodsWagon("Rectangular");
        g2.assignCargo("Petroleum");

        System.out.println("Program continues safely.");
    }
}