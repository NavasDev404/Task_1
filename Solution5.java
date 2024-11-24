//5) Write a Java program that takes the purchase amount as input and calculates the final payable amount after applying the discount.
//1. If the purchase amount is less than 500, no discount is applied.
//2. If the purchase amount is between 500 and 1000, a 10% discount is applied.
//3. If the purchase amount is greater than 1000 a 20% discount is applied.



import java.util.Scanner;

public class Solution5 {
    // Main class for the program

    public static void main(String[] args) {
        // Entry point of the program

        // Create a Scanner object to read input from the console2
        Scanner scanner = new Scanner(System.in);
        int num = 0; // Variable to store the number input
        boolean isValid = false;

        // Loop until a valid integer is entered
        while (!isValid) {
            System.out.print("Please Enter the Purchase Amount: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt(); // Read the integer input
                isValid = true; // Break the loop if input is valid
            } else {
                System.out.println("Invalid input. Please Enter a Valid Purchase Amount.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Call the finalAmount method with the input Purchase Amount
        finalAmount(num);
    }
    public static void finalAmount(int num) {
        // Check if the number is positive, negative, or zero
        if (num > 1000) {
            // Apply 20% discount if the Purchase Amount is greater than 1000
            double discount = num * 0.20;
            double finalAmount = num - discount;
            System.out.println("Final Payable Amount after 20% discount: " + finalAmount);
        } else if (num >= 500 && num <= 1000) {
            // Apply 10% discount if the Purchase Amount is between 500 and 1000
            double discount = num * 0.10;
            double finalAmount = num - discount;
            System.out.println("Final Payable Amount after 10% discount: " + finalAmount);
        } else {
            // No discount for amounts below 500
            System.out.println("Final Payable Amount: " + num);
        }
    }    
}
