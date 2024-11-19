import java.util.Scanner;

public class q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }

        System.out.println("The sum of all odd numbers is: " + sum);
    }
}
