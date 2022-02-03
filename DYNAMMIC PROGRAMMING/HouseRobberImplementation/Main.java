package Udemy.DynamicProgrammingProblemsImplementations.HouseRobberImplementation;

public class Main {
    public static void main(String[] args) {
        HouseRobberMemoization hm= new HouseRobberMemoization();
        int[] HouseNetWorth= {6,7,1,30,8,2,4};
        System.out.println(hm.maxMoney(HouseNetWorth));

        HouseRobberTabulation ht= new HouseRobberTabulation();
        System.out.println(ht.maxMoney(HouseNetWorth));
    }
}
