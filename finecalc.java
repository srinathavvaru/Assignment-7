import java.util.Scanner;

public class finecalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of days late
        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();

        // Calculate fine
        int fineAmount = calculateFine(daysLate);

        // Display fine or cancellation message
        if (fineAmount > 0) {
            System.out.println("Fine amount: Rs. " + fineAmount + "/-");
        } else if (fineAmount == -1) {
            System.out.println("Membership canceled due to returning the book after 21 days.");
        } else {
            System.out.println("No fine.");
        }

        scanner.close();
    }

    // Method to calculate fine amount
    private static int calculateFine(int daysLate) {
        if (daysLate <= 7) {
            return 50 * daysLate; // 50 paise fine per day for the first 7 days
        } else if (daysLate <= 14) {
            return 100 * (daysLate - 7); // 1 rupee fine per day for days 8 to 14
        } else if (daysLate <= 21) {
            return 500; // 5 rupees fine for days 15 to 21
        } else {
            return -1; // Membership cancellation
        }
    }
}
