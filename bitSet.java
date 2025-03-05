import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        Integer N = s.nextInt();
        Integer M = s.nextInt();

        BitSet[] b = new BitSet[] {new BitSet(N), new BitSet(N)};  

        for (int i = 0; i < M; i++) {
            String op = s.next();
            Integer p1 = s.nextInt();
            Integer p2 = s.nextInt();
            
            if (op.equals("AND")) {
                b[p1-1].and(b[p2-1]);
            } else if (op.equals("OR")) {
                b[p1-1].or(b[p2-1]);
            } else if (op.equals("XOR")) {
                b[p1-1].xor(b[p2-1]);
            } else if (op.equals("FLIP")) {
                b[p1-1].flip(p2);
            } else if (op.equals("SET")) {
                b[p1-1].set(p2);
            }
            System.out.printf("%d %d\n", b[0].cardinality(), b[1].cardinality());
        }
        
        s.close();
    }
}

/*
Input:
5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1

Output:
0 0
1 0
1 1
1 2

*/
