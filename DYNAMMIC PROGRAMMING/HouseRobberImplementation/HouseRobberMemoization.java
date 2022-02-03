package Udemy.DynamicProgrammingProblemsImplementations.HouseRobberImplementation;

public class HouseRobberMemoization {
    public int maxMoney(int[] houseNetWorth, int currIndex, int[] temp){
        if (currIndex>=houseNetWorth.length){
            return 0;
        }
        if (temp[currIndex]==0){
            int stealFromFirstHouse= houseNetWorth[currIndex]+ maxMoney(houseNetWorth, currIndex+2, temp);
            int skipFirstHouse= maxMoney(houseNetWorth, currIndex+1, temp);
            temp[currIndex]= Math.max(stealFromFirstHouse, skipFirstHouse);
        }
        return temp[currIndex];
    }
    public int maxMoney(int[] HouseNetWorth){
        int[] temp= new int[HouseNetWorth.length];
        return maxMoney(HouseNetWorth,0,temp);
    }
}
