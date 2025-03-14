import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

   // Write your code here
   public PerformOperation isOdd(){
    return a -> a % 2 != 0;
   }
   public PerformOperation isPrime() {
        return a -> {
            if (a <= 1)
                return false;
            if (a == 2 || a == 3)
                return true;

            if (a % 2 == 0 || a % 3 == 0)
                return false;

            for (int i = 5; i <= Math.sqrt(a); i = i + 6)
                if (a % i == 0 || a % (i + 2) == 0)
                    return false;
            return true;

        };
    }
    public PerformOperation isPalindrome() {

        return a -> {
            String s = "" + a;
            int i = 0, j = s.length() - 1;

            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        };
    }
}

public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}


/*
Input:
5
1 4
2 5
3 898
1 3
2 12

Output:
EVEN
PRIME
PALINDROME
ODD
COMPOSITE

*/
