import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int numberLines = in.nextInt();
        
        for(int i = 0; i < numberLines; i++) {
            
            String line = in.next();
            String even = "";
            String odd = "";
            
            for(int j = 0; j < line.length(); j++) {
                if(j == 0 || (j % 2) == 0) {
                    even += line.charAt(j);
                }
                else {
                    //It's odd
                    odd += line.charAt(j);
                }
            }
            
            System.out.println(even + " " + odd);
            
        }
    }
}