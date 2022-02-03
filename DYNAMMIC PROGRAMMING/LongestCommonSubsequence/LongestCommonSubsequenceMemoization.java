package Udemy.DynamicProgrammingProblemsImplementations.LongestCommonSubsequence;

public class LongestCommonSubsequenceMemoization {
    private int subsequence(String s1, String s2, int index1, int index2, int[][] temp){
        if (index1== s1.length() || index2== s2.length()){
            return 0;
        }
        if (temp[index1][index2]==0){
            int op3=0;
            if (s1.charAt(index1)==s2.charAt(index2)){
                op3= 1+ subsequence(s1, s2, index1+1, index2+1, temp);
            }
            int op1= subsequence(s1, s2, index1, index2+1, temp);
            int op2= subsequence(s1, s2, index1+1, index2, temp);
            temp[index1][index2]= Math.max(op1, Math.max(op2, op3));
        }
        return temp[index1][index2];
    }
    public int subsequence(String s1, String s2){
        int[][] temp= new int[s1.length()+1][s2.length()+1];
        return subsequence(s1, s2, 0, 0, temp);
    }
}
