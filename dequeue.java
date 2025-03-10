    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            HashMap<Integer,Integer> subarray = new HashMap<>();
            int n = in.nextInt();
            int m = in.nextInt();
            
            int max = 0;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.add(num);
                
                Integer xt = subarray.get(num);
                if(xt == null) subarray.put(num, 1);
                else subarray.put(num, ++xt);

                if(deque.size() == m){
                    if(subarray.size() > max) max = subarray.size();
                    int val = (Integer)deque.poll();
                    Integer rem = subarray.get(val);
                    if(rem != null){
                        rem--;
                        if(rem==0) subarray.remove(val);
                        else subarray.put(val, rem);
                     }
                }
            }
            System.out.println(max);
        }
    }



/*
Input:
6 3
5 3 5 2 3 2

Output:
3


*/


