import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        s = s.replaceAll("\\s",""); 
        //First, the spaces are removed from the text. Let L be the length of this text. 
        //Then, characters are written into a grid, whose rows and columns have the following constraints:
        int L = s.length();
        int rows = (int)Math.floor(Math.sqrt(L));
        int cols = (int)Math.ceil(Math.sqrt(L));
        
        //System.out.println("L" + L + " Rows: " + rows + " Cols:" + cols);
        
        String[] grid = new String[cols];
        
        //hae and via ecy
        for(int i = 0; i < cols; i++) {
            grid[i] = "";
        }
        
        for(int i = 0; i < s.length(); i++) {
                //System.out.println(s.charAt(i) + " " + (i%cols));// + " " + (i/cols));
                
                grid[i%cols] += ""+s.charAt(i);
            
        }
        
        for(int i = 0; i < cols; i++) {
            System.out.print(grid[i]+" ");
        }
        
    }
}
