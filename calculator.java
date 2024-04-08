import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input current year
        System.out.print("Enter the current year: ");
        int currentYear = Integer.parseInt(scanner.nextLine());

        // Input join year
        System.out.print("Enter the year the employee joined: ");
        int joinYear = Integer.parseInt(scanner.nextLine());

        // Calculate years of service
        int yearsOfService = currentYear - joinYear;

        // Determine bonus
        int bonusAmount = calculateBonus(yearsOfService);

        // Display bonus information
        if (bonusAmount > 0) {
            System.out.println("Bonus awarded: Rs. " + bonusAmount + "/-");
        } else {
            System.out.println("No bonus awarded.");
        }

        scanner.close();
    }

    // Method to calculate bonus amount
    private static int calculateBonus(int yearsOfService) {
        if (yearsOfService > 5) {
            return 5000;
        } else if (yearsOfService >= 3 && yearsOfService <= 5) {
            return 3000;
        } else {
            return 0;
        }
    }
}
