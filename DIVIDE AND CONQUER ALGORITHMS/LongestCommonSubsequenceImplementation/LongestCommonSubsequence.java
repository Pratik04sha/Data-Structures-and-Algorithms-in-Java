package Udemy.DivideAndConquerAlgorithmsImplementations.LongestCommonSubsequenceImplementation;

public class LongestCommonSubsequence {
    private int findLCSLength(String s1, String s2, int index1, int index2){
        if (index1== s1.length() || index2== s2.length()){
            return 0;
        }
        int op3=0;
        if (s1.charAt(index1)==s2.charAt(index2)){
            op3= 1+ findLCSLength(s1, s2, index1+1, index2+1);
        }
        int op1= findLCSLength(s1, s2, index1, index2+1);
        int op2= findLCSLength(s1, s2, index1+1, index2);

        return Math.max(op1, Math.max(op2, op3));
    }

    public int findLCSLength(String s1, String s2){
        return findLCSLength(s1, s2,0, 0);
    }
}
