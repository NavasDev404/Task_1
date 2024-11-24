//4) Write a java program to Find the smallest number among three numbers.

public class Solution4 {
// Main class for the program

    public static void main(String[] args) {
        // Entry point of the program

        //Initialize array  
        int [] arr = new int [] {3, 1, 2};  
        //Initialize min with first element of array.  
        int min = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with min  
           if(arr[i] <min)  
               min = arr[i];  
        }  
        System.out.println("Smallest number among the given number: " + min); 
    }  
}  