import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int even = n % 2;
        if (even == 0)
            System.out.println(n + " is even");
        else 
            System.out.println(n + " is odd");
    }
}