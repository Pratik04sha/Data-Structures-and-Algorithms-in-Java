package Udemy.DivideAndConquerAlgorithmsImplementations.LongestPalindromicSubsequenceImplementation;

public class LongestPalindromicSubsequence {
    private int findLPS(String s, int startIndex, int endIndex){
        if (startIndex> endIndex){
            return 0;
        }
        if (startIndex== endIndex){
            return 1;
        }
        int op3=0;
        if (s.charAt(startIndex)==s.charAt(endIndex)){
            op3= 2+ findLPS(s, startIndex+1, endIndex-1);
        }
        int op1= findLPS(s, startIndex, endIndex-1);
        int op2= findLPS(s, startIndex+1, endIndex);

        return Math.max(op1, Math.max(op2, op3));
    }

    public int findLPS(String s){
        return findLPS(s, 0, s.length()-1);
    }
}
