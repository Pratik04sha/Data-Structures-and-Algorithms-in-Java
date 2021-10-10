//QUESTION: Write	a	program	to	sort	the	given	array.	

package Practice;
import java.util.Scanner;
public class SortArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements of array:");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of array:");
        for (int i=0; i<n; i++){
            System.out.println("a["+(i+1)+"]:");
            arr[i]= sc.nextInt();
        }
        for (int lastUnsortedIndex= arr.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for (int i=0; i<lastUnsortedIndex; i++){
                if (arr[i]>arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }
        System.out.println("The sorted array is:");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int[] arr, int i, int j){
        if (i==j){
            return;
        }
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
