import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
     int[] counts = new int[26];
       
 
        char[] charArray = first.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
            counts[charArray[i] - 97]++;
        }
		
        charArray = second.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            counts[charArray[i] - 97]--;
        }
		
        int sum = 0;
        for(int i = 0 ; i < counts.length ;i++){
            sum+= Math.abs(counts[i]);
        }
        return sum;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

