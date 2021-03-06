// QUESTION: Find	the	Kth	largest	and	Kth	smallest	number	in	an	array.	

package Practice;
import java.util.Scanner;
public class kthLargeSmall {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of array elements:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of array:");
        for (int i=0; i<n; i++){
            System.out.println("a["+(i+1)+"]:");
            arr[i]= sc.nextInt();
        }
        for (int lastUnsortedIndex= arr.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for (int i=0; i<lastUnsortedIndex; i++){
                if (arr[i]> arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }
        System.out.println("Enter the kth largest number you want to find:");
        int kl= sc.nextInt();
        System.out.println("Enter the kth smallest number you want to find:");
        int ks= sc.nextInt();
        System.out.println(kl+"th largest number in array is: "+arr[arr.length-kl]);
        System.out.println(ks+"th smallest number in array is: "+arr[ks-1]);
    }
    public static void swap(int[] arr, int i, int j){
        if(i==j){
            return;
        }
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
}
