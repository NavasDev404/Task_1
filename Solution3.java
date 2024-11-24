//3) Write down the program to reverse the given number using loops.
//Input = 876
//Output =678

public class Solution3 {
    public static void main(String[] args) {
        String a = "876";
        String reversed = "";
        //loop for reversing the number
        for (int i = a.length() -1; i >= 0; i--) {
            reversed = reversed + a.charAt(i);
        }
        System.err.println(reversed);
    }
}
