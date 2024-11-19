import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Binary to Decimal Conversion
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary to Decimal: " + decimal);

        // Decimal to Binary Conversion
        System.out.print("Enter a decimal number: ");
        int decNumber = scanner.nextInt();
        String binaryString = Integer.toBinaryString(decNumber);
        System.out.println("Decimal to Binary: " + binaryString);

        scanner.close();
    }
}
