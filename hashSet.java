import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
       HashSet<String> set = new HashSet<>();      
       for(int j = 0; j < t; j++){
            String pairLR = pair_left[j] + " " + pair_right[j];
            String pairRL = pair_right[j] + " " + pair_left[j];
            if(!set.contains(pairRL))
                set.add(pairLR);
            System.out.println(set.size());
       }
       s.close();
    }
}


/*
Input:
5
john tom
john mary
john tom
mary anna
mary anna


Output:
1
2
2
3
3

*/
