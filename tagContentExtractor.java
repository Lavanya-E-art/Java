import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
            Pattern pattern = Pattern.compile("<([^<>]+)>([^<>]+)<\\/\\1>"); 
            Matcher matcher = pattern.matcher(line); 
            Stack<String> stack = new Stack<>();  
             
            List<String> strsFound = new LinkedList<>();
            while (matcher.find()) {   
                
                 if (matcher.group(2).length() > 0) strsFound.add(matcher.group(2)); 
            }
            if (strsFound.size() == 0) {
                System.out.println("None"); 
            }
            else {
                for (String str: strsFound) {
                    System.out.println(str); 
                }
            }
			
			testCases--;
		}
	}
}


/*
Input:
4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crash</SA premium>


Output:
Nayeem loves counseling
Sanjay has no watch
None
Imtiaz has a secret crash

*/


