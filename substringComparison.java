import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        java.util.ArrayList<String> array = new java.util.ArrayList<String>();
                
        for (int i=0; i <= (s.length() - k); i++) {
            array.add(s.substring(i, i+k));
        }
        
        java.util.Collections.sort(array); 

        smallest = array.get(0);
        largest = array.get(array.size() - 1);
        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
