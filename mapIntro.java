//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map l = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            l.put(name, phone);
			in.nextLine();
		}
        
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(l.get(s) != null){
                System.out.println(s+"="+l.get(s));
            }else{
                System.out.println("Not found");
            }
		}
        
	}
}


/*
Input:
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

Output:
uncle sam=99912222
Not found
harry=12299933

*/

