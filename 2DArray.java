import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static int maxHourGlassValue(List<List<Integer>> arr){
        int result = Integer.MIN_VALUE;
        for(int i = 0; i< arr.size()-2 ;i++){
            List<Integer>  firstRow = arr.get(i);
            List<Integer> secondRow = arr.get(i+1);
            List<Integer> ThirdRow = arr.get(i+2);

            for(int j =0; j<arr.size()-2; j++){
                int  hourGlassSum = 
                firstRow.get(j) + firstRow.get(j+1) + firstRow.get(j+2)+
                secondRow.get(j+1)+
                ThirdRow.get(j)+ThirdRow.get(j+1)+ThirdRow.get(j+2);
                result = Math.max(hourGlassSum, result);
            }  
        }
        return result;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        System.out.println(maxHourGlassValue(arr));

        bufferedReader.close();
    }
}

/*
Input:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 9 2 -4 -4 0
0 0 0 -2 0 0
0 0 -1 -2 -4 0

Output:
13

*/
