import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < n; i++){
            l.add(s.nextInt());
        }
        int queryNum = s.nextInt();
        s.nextLine(); 
        for(int j = 1; j <= queryNum; j++){
            String query = s.nextLine();
            if(query.equalsIgnoreCase("Insert")){
                int a = s.nextInt();
                int b = s.nextInt();
                l.add(a, b);
                if (s.hasNextLine()) {
                    s.nextLine(); 
                }
            }else if(query.equalsIgnoreCase("Delete")){
                int d = s.nextInt();
                l.remove(d);
                if (s.hasNextLine()) {
                    s.nextLine(); 
                }
            }
        }
        for(int e : l){
            System.out.print(e + " ");
        }
    }
}

/*
Input:
5
12 0 1 78 12
2
Insert
5 23
Delete
0

Output:
0 1 78 12 23

*/
