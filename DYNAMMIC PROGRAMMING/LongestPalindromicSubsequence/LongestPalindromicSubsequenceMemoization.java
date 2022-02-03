package Udemy.DynamicProgrammingProblemsImplementations.LongestPalindromicSubsequence;

public class LongestPalindromicSubsequenceMemoization {
    private int findLPS(String s, int start, int end, int[][] temp){
        if (start> end){
            return 0;
        }
        if (start== end){
            return 1;
        }
        if (temp[start][end]==0){
            int op3=0;
            if (s.charAt(start)==s.charAt(end)){
                op3= 2+ findLPS(s,start+1, end-1, temp);
            }
            int op1= findLPS(s, start, end-1, temp);
            int op2= findLPS(s, start+1, end, temp);

            temp[start][end]= Math.max(op1, Math.max(op2, op3));
        }
        return temp[start][end];
    }
    public int findLPS(String s){
        int[][] temp= new int[s.length()+1][s.length()+1];
        return findLPS(s, 0, s.length()-1, temp);
    }
}
