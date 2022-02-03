package Udemy.GreedyAlgorithmsImplementations.FractionalKnapsackProblemImplementation;
import java.util.*;
public class FractionalKnapsack {
    static void knapsack(ArrayList<KnapsackItem> items, int capacity){  // Time Complexity: O(NlogN)
        Comparator<KnapsackItem> comparator= new Comparator<KnapsackItem>() {   //......O(1)
            @Override
            public int compare(KnapsackItem o1, KnapsackItem o2) {
                if (o1.getRatio()< o2.getRatio()){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };
        Collections.sort(items, comparator);    //......O(NlogN)
        int usedCapacity=0; //.....O(1)
        double totalValue=0;    //.....O(1)

        for (KnapsackItem item: items){     //.....O(N)
            if (usedCapacity+ item.getWeight()<=capacity){  //.....O(1)
                usedCapacity+= item.getWeight();
                System.out.println("Taken: "+item);
                totalValue+= item.getValue();
            }
            else {  //......O(1)
                int usedWeight= capacity- usedCapacity;
                double value= item.getRatio()* usedWeight;
                System.out.println("Taken: item index= "+ item.getIndex()+", obtained value= "+value+", used weight= "+usedWeight+", ratio= "+item.getRatio());
                usedCapacity+= usedWeight;
                totalValue+=value;
            }
            if (usedCapacity== capacity){   //.......O(1)
                break;
            }
        }
        System.out.println("\n Total Value obtained: "+ totalValue);    //.....O(1)
    }
}
