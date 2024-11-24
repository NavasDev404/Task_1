//2) Write a program that find a given number is negative or positive.



import java.util.Scanner;

public class Solution2 {
    // Main class for the program

    public static void main(String[] args) {
        // Entry point of the program

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        int num = 0; // Variable to store the number input
        boolean isValid = false;

        // Loop until a valid integer is entered
        while (!isValid) {
            System.out.print("Enter a number: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt(); // Read the integer input
                isValid = true; // Break the loop if input is valid
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Call the findnum method with the input number
        findnum(num);
    }

    public static void findnum(int num) {
        // Check if the number is positive, negative, or zero
        if (num > 0) {
            System.out.println("Given Number Is Positive");
        } else if (num < 0) {
            System.out.println("Given Number Is Negative");
        } else {
            System.out.println("Given Number Is Zero");
        }
    }
}
