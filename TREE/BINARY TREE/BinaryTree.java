package Udemy.Tree.BinaryTreeArrayImplementation;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;
    public BinaryTree(int size){    // Time Complexity: O(1)
        arr= new String[size+1];    //........O(1)
        this.lastUsedIndex=0;       //........O(1)
        System.out.println("A blank tree of size "+size+ " has been created!!");    //...O(1)
    }

    public boolean isFull(){    // Time Complexity: O(1)
        if (arr.length-1 == lastUsedIndex){ //.....O(1)
            return true;
        }
        else{   //.....O(1)
            return false;
        }
    }

    void insert(String value){  // Time Complexity: O(1)
        if (!isFull()){ //.....O(1)
            arr[lastUsedIndex+1]= value;    //.....O(1)
            lastUsedIndex++;    //.....O(1)
            System.out.println("The value " +value+ " has been successfully inserted!!");   //.....O(1)
        }
        else{   //.....O(1)
            System.out.println("The Binary Tree is Full!!");
        }
    }

    public void preOrder(int index){    // Time Complexity: O(N)
        if (index> lastUsedIndex){  //........O(1)
            return; //.......O(1)
        }
        System.out.println(arr[index]+" "); //........O(1)
        preOrder(index*2);  //........O(N/2)
        preOrder(index*2 +1);   //........O(N/2)
    }

    public void inOrder(int index){ // Time Complexity: O(N)
        if (index> lastUsedIndex){  //........O(1)
            return; //.......O(1)
        }
        inOrder(index*2);  //........O(N/2)
        System.out.println(arr[index]+" "); //........O(1)
        inOrder(index*2 +1);    //........O(N/2)
    }

    public void postOrder(int index){   // Time Complexity: O(N)
        if (index> lastUsedIndex){  //........O(1)
            return; //.......O(1)
        }
        postOrder(index*2);  //........O(N/2)
        postOrder(index*2 +1);  //........O(N/2)
        System.out.println(arr[index]+" "); //........O(1)
    }

    public void levelOrder(){   // Time Complexity: O(N)
        for (int i = 1; i <= lastUsedIndex ; i++) { //.....O(N)
            System.out.println(arr[i]+" "); //....O(1)
        }
    }

    public int search(String value) {    // Time Complexity: O(N)
        for (int i = 1; i <= lastUsedIndex; i++) { //.....O(N)
            if (arr[i] == value) {    //.....O(1)
                System.out.println(value + " exists at the location: " + i);
                return i;
            }
        }
        System.out.println(value + " does not exists in the Binary Tree!");   //O(1)
        return -1;  //.....O(1)
    }

    public void delete(String value){   // Time Complexity: O(N)
        int location= search(value);    //......O(N)
        if (location== -1){     //.........O(1)
            return;
        }
        else {
            arr[location]= arr[lastUsedIndex];  //....O(1)
            lastUsedIndex--;    //....O(1)
            System.out.println("Node successfully deleted!!");  //....O(1)
        }
    }

    public void deleteBT(){     // Time Complexity: O(1)
        try {   //....O(1)
            arr= null; //....O(1)
            System.out.println("Binary Tree deleted successfully!!");   //....O(1)
        }
        catch (Exception e){    //....O(1)
            System.out.println("There was an error deleting the tree!!");   //....O(1)
        }

    }
}
