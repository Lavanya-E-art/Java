import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger x = new BigInteger(n);
        if(x.isProbablePrime(100)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}

/*
Input:
13

Output:
prime

*/
