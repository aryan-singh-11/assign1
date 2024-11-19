import java.util.Scanner;

class Commission {
    private double sales;

    public Commission(double sales) {
        if (sales >= 0) {
            this.sales = sales;
        } else {
            System.out.println("Invalid Input");
            this.sales = -1;
        }
    }

    public double calculateCommission() {
        if (sales < 0) return 0;
        return sales * 0.1; 
    }
}

public class q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sales amount: ");
        double sales = scanner.nextDouble();

        Commission commission = new Commission(sales);
        if (sales >= 0) {
            double commissionAmount = commission.calculateCommission();
            System.out.println("The commission is: " + commissionAmount);
        }
    }
}
