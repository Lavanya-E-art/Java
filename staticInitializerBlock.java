import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static int B;
public static int H;
public static boolean flag;
    static{
        Scanner sc = new Scanner(System.in);
        B=sc.nextInt();
        H=sc.nextInt();
        flag = true;
        try{
            if(B<=0 || H<=0){
               flag = false;
               throw(new Exception("java.lang.Exception: Breadth and height must be positive"));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

