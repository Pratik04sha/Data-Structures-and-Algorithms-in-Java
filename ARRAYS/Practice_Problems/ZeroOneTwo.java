// QUESTION: Given	an	array	which	consists	of	only	0,	1	and	2.	Sort	the	array	without	using	any	sorting	algorithm.	

package Practice;
import java.util.Scanner;
public class ZeroOneTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of array elements:");
        int n= sc.nextInt();
        int[] array= new int[n];
        System.out.println("Enter array elements:");
        for (int i=0; i<n; i++){
            System.out.println("a["+(i+1)+"]:");
            array[i]= sc.nextInt();
        }
        for (int i=0; i<array.length; i++){
            if (array[i]==0){
                System.out.print("0 ");
            }
        }
        for (int i=0; i<array.length; i++){
            if (array[i]==1){
                System.out.print("1 ");
            }
        }
        for (int i=0; i<array.length; i++){
            if (array[i]==2){
                System.out.print("2 ");
            }
        }
    }

}
