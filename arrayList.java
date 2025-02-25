import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = s.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(s.nextInt());
            }
            lines.add(line);
        }
        int q = s.nextInt();
        for(int k = 0; k < q; k++){
            int x = s.nextInt();
            int y = s.nextInt();
            try{
                int ele = lines.get(x-1).get(y-1);   
                System.out.println(ele);             
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}


/*
Input:
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Output:
74
52
37
ERROR!
ERROR!

*/
