// For problem https://codeforces.com/problemset/problem/282/A
// Problem: Bit++
// The variable x starts at 0 and is either incremented or decremented
// based on n given operations like "++X", "X++", "--X", or "X--"

import java.util.Scanner; // Import Scanner class for taking input

public class problem282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object to read input from the user

        int n = sc.nextInt();  // Read the number of operations (n)

        int x = 0;  // Initialize x to 0

        // Loop through each operation
        for (int i = 0; i < n; i++) {
            String s = sc.next();  // Read the operation as a string (e.g., "++X", "X--", etc.)

            // Check the second character in the string to determine the operation
            if (s.charAt(1) == '+') {  // If the middle character is '+', it's an increment
                x++;                   // Increment x
            } else {                   // Otherwise, it's a decrement (since only '+' or '-' are possible in middle)
                x--;                   // Decrement x
            }
        }

        // Output the final value of x after all operations
        System.out.println(x);

        sc.close();  // Close the scanner to free up system resources
    }
}
