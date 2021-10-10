// QUESTION: Find	the	minimum	and	maximum	element	in	an	array.

package Practice;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of array elements:");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter array elements:");
        for (int i=0; i<n; i++){
            System.out.println("a["+(i+1)+"]:");
            arr[i]= sc.nextInt();
        }
        for(int lastUnsortedIndex= arr.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for (int i=0; i< lastUnsortedIndex; i++){
                if (arr[i]>arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }
            System.out.println("Min:"+ arr[0]);
            System.out.println("Max:"+arr[arr.length-1]);

    }
    public static void swap(int[] arr, int i, int j){
        if (i==j){
            return;
        }
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}
