import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;
import java.nio.charset.StandardCharsets;

public class Solution {

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedhash = digest.digest(
                originalString.getBytes(StandardCharsets.UTF_8));
            System.out.println(bytesToHex(encodedhash));
        }
        catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
    }
    
}

/*
Input:
HelloWorld

Output:
872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4


*/
