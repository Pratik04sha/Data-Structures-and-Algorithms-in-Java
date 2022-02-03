package Udemy.DynamicProgrammingProblemsImplementations.LongestCommonSubsequence;

public class Main {
    public static void main(String[] args) {
        LongestCommonSubsequenceMemoization lcs= new LongestCommonSubsequenceMemoization();
        System.out.println(lcs.subsequence("elephant","erepat"));

        LongestCommonSubsequenceTabulation lct= new LongestCommonSubsequenceTabulation();
        System.out.println(lct.subsequence("elephant","erepat"));
    }
}
