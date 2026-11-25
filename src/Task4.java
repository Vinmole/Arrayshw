public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 4, 9, 7, 1, 2, 8, 4};
        System.out.print("Array: ");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
        boolean hasDuplic = false;
        System.out.print("Duplicate numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            // Skip if this value already appeared earlier (already handled)
            boolean seenBefore = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    seenBefore = true;
                    break;
                }
            }
            if (seenBefore) {
                continue;
            }
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    System.out.print(numbers[i] + " ");
                    hasDuplic = true;
                    break;
                }
            }
        }
        if (!hasDuplic) {
            System.out.print("none");
        }
        System.out.println();
    }
}