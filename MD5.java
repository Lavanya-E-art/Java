import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        String str;
        boolean result = false;
        while(s.hasNext()){
            str = s.nextLine().trim();
            result = Pattern.matches("^[a-zA-Z0-9]+$",str);
            if(result){
                try{
                    MessageDigest md = MessageDigest.getInstance("MD5");

                    md.update(str.getBytes());
                    
                    byte[] digest = md.digest();
                    
                    for(byte b : digest){
                        System.out.printf("%02x",b);
                    }
                    System.out.println();

                } catch (Exception e){

                }                
            } else {
                System.out.println("Invalid Input!");
            }
        }
        s.close();
    }
}

/*
Input:
HelloWorld

Output:
68e109f0f40ca72a15e05cc22786f8e6


*/
