import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        BigDecimal a,b;
        for(int i = 0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                a=new BigDecimal(s[j]);
                b=new BigDecimal(s[j+1]);
                if(a.compareTo(b)<0){
                    String temp = s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}

/*
Input:
9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

Output:
90
56.6
50
02.34
0.12
.12
0
000.000
-100

*/
