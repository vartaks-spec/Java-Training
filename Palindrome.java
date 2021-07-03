import java.util.Scanner;
//This is a typical dynamic problem
//It is similar to finding the subsequence question
// We will divide our string into two parts and try to make them symetrical by inserting letters
public class Palindrome {
    public static int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        /* This matrix dp[i][j] shows us length of longest common sequence between i
        first letters in s1 and j first letters in s2.*/
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){//s2 is actually the reading the list backwards to split the string
                if (s.charAt(i) == s.charAt(n - 1 - j)){ //if we get same characters we dont need the insertion so add 1
                    dp[i+1][j+1] = dp[i][j] + 1;
                } else {
                    dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]); // else carry forward what was the previous max value
                }
            }
        }
        return n - dp[n][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(minInsertions(str));

    }
}