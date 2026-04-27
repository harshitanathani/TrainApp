public class UC16 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        int[] capacities = {72, 56, 24, 70, 60};

        bubbleSort(capacities);

        System.out.print("Sorted Capacities: ");

        for (int value : capacities) {
            System.out.print(value + " ");
        }
    }

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}