package Udemy.DynamicProgrammingProblemsImplementations.LongestPalindromicSubsequence;

public class Main {
    public static void main(String[] args) {
        LongestPalindromicSubsequenceMemoization lps= new LongestPalindromicSubsequenceMemoization();
        System.out.println(lps.findLPS("AWEEWMEA"));

        LongestPalindromicSubsequenceTabulation lpt= new LongestPalindromicSubsequenceTabulation();
        System.out.println(lpt.palindrome("AWEEWMEA"));
    }
}
