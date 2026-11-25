import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Original: ");
        for (int value : num) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Enter index to remove: ");
        int index = scanner.nextInt();

        if (index < 0 || index >= num.length) {
            System.out.println("Invalid index.");
            return;
        }
        for (int i = index; i < num.length - 1; i++) {
            num[i] = num[i + 1];
        }
        System.out.print("Updated: ");
        for (int i = 0; i < num.length - 1; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}