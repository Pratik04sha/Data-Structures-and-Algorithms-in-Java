package Udemy.DivideAndConquerAlgorithmsImplementations.MinimumCostToReachLastCellImplementation;

public class MinimumCostToReachLastCell {
    public int findMinCost(int[][] cost, int row, int column){
        if (row==-1 || column==-1){
            return Integer.MAX_VALUE;
        }
        if (row==0 && column==0){
            return cost[0][0];
        }
        int minCost1= findMinCost(cost, row-1, column);
        int minCost2= findMinCost(cost, row, column-1);
        int minCost= Integer.min(minCost1, minCost2);

        return cost[row][column]+minCost;
    }
}
