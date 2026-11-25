public class Task2 {
    public static void main(String[] args) {
        findSecondLargest(new int[]{10, 25, 8, 30, 15, 30});
        System.out.println();
        findSecondLargest(new int[]{5, 5, 5, 5, 5, 5});
    }

    static void findSecondLargest(int[] numbers) {
        System.out.print("Array: ");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Find the largest
        int largest = numbers[0];
        for (int value : numbers) {
            if (value > largest) {
                largest = value;
            }
        }

        // second largest not the first largest
        boolean found = false;
        int second = 0;
        for (int value : numbers) {
            if (value != largest && (!found || value > second)) {
                second = value;
                found = true;
            }
        }

        if (found) {
            System.out.println("Largest: " + largest);
            System.out.println("Second largest: " + second);
        } else {
            System.out.println("No second largest distinct number.");
        }
    }
}