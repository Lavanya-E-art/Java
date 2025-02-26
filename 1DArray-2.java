import java.util.*;

public class Solution {
    
    public static boolean find_path(int leap, int[] game, int x) {
        if (x < 0) {
            return false;
        }

        if (x > game.length - 1) {
            return true;
        }

        if (game[x] != 0) {
            return false;
        }

        game[x] = 2;

        if (find_path(leap, game, x + 1)) {
            return true;
        }
        if (find_path(leap, game, x + leap)) {
            return true;
        }
        if (find_path(leap, game, x - 1)) {
            return true;
        }

        game[x] = 0;

        return false;
    }

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return find_path(leap, game, 0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

/*
Input:
4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0

Output:
YES
YES
NO
NO

*/
