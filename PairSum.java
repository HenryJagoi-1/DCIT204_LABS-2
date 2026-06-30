import java.util.Scanner;

public class PairSumBruteForceInteractive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        if (size <= 1) {
            System.out.println("Array must contain at least 2 elements.");
            sc.close();
            return;
        }

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("\n--- Pair Found ---");
                    System.out.println("Index 1: " + i + " | Value: " + arr[i]);
                    System.out.println("Index 2: " + j + " | Value: " + arr[j]);
                    System.out.println("Equation: " + arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("\nNo pair found whose sum equals " + target + ".");
        }

        sc.close();
    }
}
