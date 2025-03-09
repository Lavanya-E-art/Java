import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        try{
            int x = s.nextInt();
            int y = s.nextInt();
            int c = x/y;
            System.out.println(c);
        }catch(InputMismatchException a){
            System.out.println("java.util.InputMismatchException");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

/*
(1)
Input:
10
3

Output:
3

(2)
Input:
10
Hello

Output:
java.util.InputMismatchException


*/
