//6) Write a java program to print bellowed pattern ->i and j and k=>5
//55555
//54444
//54333
//54322
//54321

public class Solution6 {
    public static void main(String[] args) {

        // Outer loop controls the rows
        for (int i = 5; i >= 1; i--) {
            // Inner loop controls the columns
            for (int j = 5; j >= 1; j--) {
                // Print the decreasing numbers in each row
                if (j >= i) {
                    System.out.print(j); // Print the column number if j >= i
                } else {
                    System.out.print(i); // Otherwise, print the row number
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
