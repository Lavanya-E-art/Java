import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = i; j < n; j++){
                sum += arr[j];
                if (sum < 0) count++; 
            }
        }
        System.out.println(count);
    }
}

/*
Input:
5
1 -2 4 -5 1

Output:
9

*/
