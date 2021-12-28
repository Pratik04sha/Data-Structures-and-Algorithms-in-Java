package Udemy.Tree.BinarySearchTreeLinkedListImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    static BinaryNode root;
    public BinarySearchTree(){  // Time Complexity: O(1)
        root= null; //....O(1)
    }

    private BinaryNode insert(BinaryNode currNode, int value){  // Time Complexity: O(logN)
        if (currNode== null){   //....O(1)
            BinaryNode newNode= new BinaryNode();   //....O(1)
            newNode.value= value;   //....O(1)
            System.out.println("The value successfully inserted!!");    //....O(1)
            return newNode; //....O(1)
        }
        else if (value<= currNode.value){
            currNode.left= insert(currNode.left, value);    //....O(N/2)
            return currNode;    //....O(1)
        }
        else{
            currNode.right= insert(currNode.right, value);  //....O(N/2)
            return currNode;    //....O(1)
        }
    }

    void insert(int value){
        root= insert(root, value);
    }

    public void preOrder(BinaryNode node){  // Time Complexity: O(N)
        if (node== null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(BinaryNode node){   // Time Complexity: O(N)
        if (node== null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }

    public void postOrder(BinaryNode node){     // Time Complexity: O(N)
        if (node== null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }

    public void levelOrder(){   // Time Complexity: O(N)
        Queue<BinaryNode> queue= new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode= queue.remove();
            System.out.print(presentNode.value+" ");
            if (presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if (presentNode.right!= null){
                queue.add(presentNode.right);
            }
        }
    }

    BinaryNode Search(BinaryNode node, int value){  // Time Complexity: O(logN)
        if (node== null){   //..........O(1)
            System.out.println("Value: "+value+" not found in BST");
            return null;
        }
        else if (node.value== value){   //...........O(1)
            System.out.println("Value: "+value+" found in BST");
            return node;
        }
        else if (value < node.value){
            return Search(node.left, value);    //........O(N/2)
        }
        else {
            return Search(node.right, value);   //........O(N/2)
        }
    }

    public static BinaryNode minimumNode(BinaryNode root){
        if (root.left== null){
            return root;
        }
        else {
            return minimumNode(root.left);
        }
    }

    public BinaryNode deleteNode(BinaryNode root, int value){   // Time Complexity: O(logN)
        if (root== null){   //..........O(1)
            System.out.println("Value not found in BST.");
            return null;
        }
        if (value< root.value){ //..........O(N/2)
            root.left= deleteNode(root.left, value);
        }
        else if (value> root.value){    //..........O(N/2)
            root.right= deleteNode(root.right, value);
        }
        else {
            if (root.left!= null && root.right!= null){
                BinaryNode temp= root;  //..........O(1)
                BinaryNode minNodeForRight= minimumNode(temp.right);   //..........O(logN)
                root.value= minNodeForRight.value;  //..........O(1)
                root.right= deleteNode(root.right, minNodeForRight.value);  //..........O(N/2)
            }
            else if (root.left!= null){ //..........O(1)
                root= root.left;
            }
            else if (root.right!= null){    //..........O(1)
                root= root.right;
            }
            else {  //..........O(1)
                root= null;
            }
        }
        return root;    //..........O(1)
    }

    public void deleteBST(){    // Time Complexity: O(1)
        root=null;
        System.out.println("Binary Search Tree deleted successfully!!");
    }
}
