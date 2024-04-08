import java.util.Scanner;

public class checkvowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert input string to lowercase for case-insensitive comparison
        inputString = inputString.toLowerCase();

        // Check if a vowel is present and count the total number of vowels
        int vowelCount = 0;
        boolean vowelPresent = false;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (isVowel(ch)) {
                vowelPresent = true;
                vowelCount++;
            }
        }

        // Display result
        if (vowelPresent) {
            System.out.println("Vowels are present in the string.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present in the string.");
        }

        scanner.close();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
