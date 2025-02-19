import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();
        String newB = "";

        for (int i=0; i<a.length(); i++) {
            String check = String.valueOf(a.charAt(i));

            if (b.contains(check)) {
                newB += a.charAt(i);
                b = b.replaceFirst(check, "");
            }else {
                return false; 
            }
        }

        return a.contains(newB) && b.isEmpty();
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
