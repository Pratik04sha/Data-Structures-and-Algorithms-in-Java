package Udemy.DynamicProgrammingProblemsImplementations.HouseRobberImplementation;

public class HouseRobberTabulation {
    public int maxMoney(int[] HouseWealth){
        int n= HouseWealth.length;
        int[] temp= new int[n+2];
        temp[n]=0;
        for (int i = n-1; i >=0 ; i--) {
            temp[i]= Math.max(HouseWealth[i]+temp[i+2], temp[i+1] );
        }
        return temp[0];
    }
}
