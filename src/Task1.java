
public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {5, -3, 8, -1, 0, 12, -7, 4, 9, -2};

        System.out.print("Original: ");
        printArray(numbers);

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
                count++;
            }
        }

        System.out.print("Modified: ");
        printArray(numbers);
        System.out.println("Replacements: " + count);
    }

    static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}