package Udemy.Tree.BinaryHeap;

public class BinaryHeap {
    int arr[];
    int sizeOfTree;

    public BinaryHeap(int size){    // Time Complexity: O(1)
        arr= new int[size+1];
        this.sizeOfTree=0;
        System.out.println("Binary Heap has been created!!");
    }

    public boolean isEmpty(){   // Time Complexity: O(1)
        if (sizeOfTree==0){
            return true;
        }
        else {
            return false;
        }
    }

    public Integer peek(){  // Time Complexity: O(1)
        if (isEmpty()){
            System.out.println("The Binary Heap is empty!!");
            return null;
        }
        else {
            return arr[1];
        }
    }

    public int sizeOfBP(){  // Time Complexity: O(1)
        return sizeOfTree;
    }

    public void levelOrder(){   // Time Complexity: O(N)
        for (int i = 1; i <= sizeOfTree ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public void heapifyBottomToTop(int index, String heapType){ // Time Complexity: O(logN)
        int parent= index/2;    //........O(1)
        if (index<=1){  //........O(1)
            return;
        }
        if (heapType=="Min"){   //........O(1)
            if (arr[index]< arr[parent]){   //........O(1)
                int temp= arr[index];
                arr[index]= arr[parent];
                arr[parent]= temp;
            }
        }
        else if (heapType=="Max"){  //........O(1)
            if (arr[index]> arr[parent]){   //........O(1)
                int temp= arr[index];
                arr[index]= arr[parent];
                arr[parent]= temp;
            }
        }
        heapifyBottomToTop(parent, heapType);   //........O(logN)
    }

    public void insert(int value, String typeOfHeap){   // Time Complexity: O(logN)
        arr[sizeOfTree+1]= value;   //........O(1)
        sizeOfTree++;   //........O(1)
        heapifyBottomToTop(sizeOfTree, typeOfHeap); //........O(logN)
        System.out.println("Inserted "+value+" successfully in the Heap!!");    //........O(1)
    }

    public void heapifyTopToBottom(int index, String heapType){ // Time Complexity: O(logN)
        int left= index*2;  //.......O(1)
        int right= (index*2) +1;    //.......O(1)
        int swapChild = 0;  //.......O(1)
        if (sizeOfTree< left){  //.......O(1)
            return;
        }
        if (heapType=="Max"){   //.......O(1)
            if (sizeOfTree== left){ //.......O(1)
                if (arr[index]< arr[left]){
                    int temp= arr[index];
                    arr[index]= arr[left];
                    arr[left]= temp;
                }
                return; //.......O(1)
            }
            else {  //.......O(1)
                if (arr[left]> arr[right]){ //.......O(1)
                    swapChild= left;
                }
                else {  //.......O(1)
                    swapChild= right;
                }
                if (arr[index]< arr[swapChild]){    //.......O(1)
                    int temp= arr[index];
                    arr[index]= arr[swapChild];
                    arr[swapChild]= temp;
                }
            }
        }
        else if (heapType=="Min"){  //.......O(1)
            if (sizeOfTree== left){ //.......O(1)
                if (arr[index]> arr[left]){
                    int temp= arr[index];
                    arr[index]= arr[left];
                    arr[left]= temp;
                }
                return; //.......O(1)
            }
            else {  //.......O(1)
                if (arr[left]< arr[right]){ //.......O(1)
                    swapChild= left;
                }
                else {  //.......O(1)
                    swapChild= right;
                }
                if (arr[index]> arr[swapChild]){    //.......O(1)
                    int temp= arr[index];
                    arr[index]= arr[swapChild];
                    arr[swapChild]= temp;
                }
            }
        }
       heapifyTopToBottom(swapChild, heapType); //.......O(logN)
    }

    public int extractHeadOfBH(String heapType){    // Time Complexity: O(logN)
        if (isEmpty()){ //.......O(1)
            return -1;
        }
        else {
            int extractedValue= arr[1]; //.......O(1)
            arr[1]= arr[sizeOfTree];    //.......O(1)
            sizeOfTree--;   //.......O(1)
            heapifyTopToBottom(1, heapType);    //.......O(logN)
            return extractedValue;  //.......O(1)
        }
    }

    public void deleteBH(){ // Time Complexity: O(1)
        arr= null;
        System.out.println("The Binary Heap has been successfully deleted!!");
    }
}
