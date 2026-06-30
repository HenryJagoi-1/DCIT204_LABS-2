import java.util.Scanner;

public class FindMaximumInteractive {

    
    public static int findMaxIndex(int[] arr) {
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;

       
        do {
            System.out.print("Enter the number of elements in the array: ");
            size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("Error: Array size must be greater than 0.\n");
            }

        } while (size <= 0);

        int[] numbers = new int[size];

        
        System.out.println("\nEnter the array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int maxIndex = findMaxIndex(numbers);
        int maxValue = numbers[maxIndex];

        
        System.out.println("\n========= RESULT =========");
        System.out.println("Array Elements:");

        for (int value : numbers) {
            System.out.print(value + " ");
        }

        System.out.println("\n------------------------");
        System.out.println("Maximum Value : " + maxValue);
        System.out.println("Index         : " + maxIndex);
        System.out.println("==========================");

        scanner.close();
    }
}
