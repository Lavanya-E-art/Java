import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if(A.equals(new StringBuffer(A).reverse().toString())){ //String Palindrome Check
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}



