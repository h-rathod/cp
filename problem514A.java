// For the problem https://codeforces.com/contest/514/problem/A
// A. Chewbacca and Number

import java.util.Scanner; // Import Scanner class for reading user input

public class problem514A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from a user
        String s = sc.next();                // Read the number as a string (so we can process digit by digit)

        StringBuilder sb = new StringBuilder(s); // Create a mutable string (StringBuilder) to modify digits

        // Loop through each digit in the number
        for (int i = 0; i < sb.length(); i++) {
            int digit = sb.charAt(i) - '0';        // Convert the current character to an integer digit
            int transformed = 9 - digit;           // Compute the 9's complement of the digit

            // Check if the transformed digit is smaller than the original
            if (transformed < digit) {
                // Special rule: The first digit cannot be 0 (to avoid leading zeros)
                if (i == 0 && transformed == 0) continue; // Skip transformation if it results in leading zero

                // Replace the current character with the transformed digit (converted back to a character)
                sb.setCharAt(i, (char) (transformed + '0'));
            }
        }

        // Print the final transformed number
        System.out.println(sb.toString());

        sc.close(); // Close the scanner to prevent resource leak
    }
}
