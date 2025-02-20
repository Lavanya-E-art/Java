import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        String[] answer =s.split("[ !,?._'@]+");
        if(s.isEmpty()){
            System.out.println(0);
        }else System.out.println(answer.length);

        for(String ss : answer){
            System.out.println(ss);
        }
        scan.close();
    }
}

/*Input: He is a very very good boy, isn't he?

Ouput: 
10
He
is
a
very
very
good
boy
isn
t
he
*/
