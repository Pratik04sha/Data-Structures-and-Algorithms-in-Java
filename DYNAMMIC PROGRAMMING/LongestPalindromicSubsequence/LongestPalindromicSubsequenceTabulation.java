package Udemy.DynamicProgrammingProblemsImplementations.LongestPalindromicSubsequence;

public class LongestPalindromicSubsequenceTabulation {
    public int palindrome(String s){
        int[][] dp= new int[s.length()][s.length()];
        for (int col = 0; col < s.length(); col++) {
            for (int row = s.length()-1; row >=0 ; row--) {
                if (row> col){
                    dp[row][col]=0;
                }
                else if (row== col){
                    dp[row][col]=1;
                }
                else {
                    if (s.charAt(row)==s.charAt(col)){
                        dp[row][col]= Math.max(2+dp[row+1][col-1],Math.max(dp[row][col-1],dp[row+1][col]));
                    }
                    else {
                        dp[row][col]= Math.max(dp[row][col-1], dp[row+1][col]);
                    }
                }
            }
        }
        return dp[0][s.length()-1];
    }
}
