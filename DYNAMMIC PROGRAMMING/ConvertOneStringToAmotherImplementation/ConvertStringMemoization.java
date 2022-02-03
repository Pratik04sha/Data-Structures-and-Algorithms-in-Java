package Udemy.DynamicProgrammingProblemsImplementations.ConvertOneStringToAmotherImplementation;

public class ConvertStringMemoization {
    public int findMinimumOp(String s1, String s2, int index1, int index2, int[][] temp){
        if (temp[index1][index2]== 0){
            if (index1==s1.length()){
                temp[index1][index2]= s2.length()-index2;
            }
            else if (index2==s2.length()){
                temp[index1][index2]= s1.length()-index1;
            }
            else if (s1.charAt(index1) == s2.charAt(index2)) {
                temp[index1][index2]= findMinimumOp(s1, s2, index1+1, index2+1, temp);
            }
            else {
                int deleteOp=1+ findMinimumOp(s1, s2, index1, index2+1, temp);
                int insertOp=1+ findMinimumOp(s1, s2, index1+1, index2, temp);
                int replaceOp=1+ findMinimumOp(s1, s2, index1+1, index2+1, temp);
                temp[index1][index2]= Math.min(deleteOp, Math.min(insertOp, replaceOp));
            }
        }
        return temp[index1][index2];
    }

    public int findMinOp(String s1, String s2){
        int[][] temp= new int[s1.length()+1][s2.length()+1];
        return findMinimumOp(s1,s2,0,0,temp);
    }
}
