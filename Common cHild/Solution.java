import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static int[][] dp;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
       
        char[] a = in.next().toCharArray();
        char[] b = in.next().toCharArray();
        
        dp = new int[a.length + 1][b.length + 1];
        dp[0][0] = 0;
        
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    dp[i+1][j+1] = dp[i][j] + 1;
                }
                else {
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        
        /*
        for(int i = 0; i <= a.length; i++) {
            for(int j = 0; j <= b.length; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }*/
        
        System.out.println(dp[a.length][b.length]);
    }
}