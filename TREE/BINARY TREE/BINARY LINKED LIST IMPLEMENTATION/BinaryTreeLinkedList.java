package Udemy.Tree.BinaryTreeLinkedListImplementation;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLinkedList {
    BinaryNode root;

    public BinaryTreeLinkedList(){  //Time Complexity: O(1)
        this.root= null;    //........O(1)
    }
    
    void preOrder(BinaryNode node){ //Time Complexity: O(N)
        if (node== null){   //.......O(1)
            return;
        }
        System.out.println(node.value+" "); //......O(1)
        preOrder(node.left);    //.........O(N/2)
        preOrder(node.right);   //........O(N/2)
    }
    
    void inOrder(BinaryNode node){  //Time Complexity: O(N)
        if (node== null){   //.....O(1)
            return;
        }
        inOrder(node.left); //........O(N/2)
        System.out.println(node.value+" "); //.....O(1)
        inOrder(node.right);   //.....O(N/2)
    }

    void postOrder(BinaryNode node){    //Time Complexity: O(N)
        if (node== null){   //.....O(1)
            return;
        }
        postOrder(node.left);   //.....O(N/2)
        postOrder(node.right);  //.....O(N/2)
        System.out.println(node.value+" "); //.....O(1)
    }

    void leveOrder(){   // Time Complexity: O(N)
        Queue<BinaryNode> queue= new LinkedList<BinaryNode>();  //.....O(1)
        queue.add(root);    //.....O(1)
        while (!queue.isEmpty()){   //.....O(N)
            BinaryNode presentNode= queue.remove(); //.....O(1)
            System.out.println(presentNode.value+" ");  //.....O(1)
            if (presentNode.left!=null){    //.....O(1)
                queue.add(presentNode.left);
            }
            if (presentNode.right!=null){   //.....O(1)
                queue.add(presentNode.right);
            }
        }
    }

    public void search(String value){   // Time Complexity: O(N)
        Queue<BinaryNode> queue= new LinkedList<BinaryNode>();  //.....O(1)
        queue.add(root);    //.....O(1)
        while (!queue.isEmpty()){   //.....O(N)
            BinaryNode presentNode= queue.remove(); //.....O(1)
            if (presentNode.value== value){ //.....O(1)
                System.out.println("The value "+value+" is found in the Tree!!");
                return;
            }
            if (presentNode.left!= null){   //.....O(1)
                queue.add(presentNode.left);
            }
            if (presentNode.right!= null){  //.....O(1)
                queue.add(presentNode.right);
            }
        }
        System.out.println("The value "+value+" is not found in the Tree!!");   //.....O(1)
    }

    void insert(String data){   // Time Complexity: O(N)
        BinaryNode newNode= new BinaryNode();   //.....O(1)
        newNode.value= data;    //.....O(1)
        if (root== null){   //.....O(1)
            root= newNode;
            System.out.println("Successfully inserted new node at root!!");
            return;
        }
        Queue<BinaryNode> queue= new LinkedList<BinaryNode>();  //.....O(1)
        queue.add(root);    //.....O(1)
        while (!queue.isEmpty()){   //........O(N)
            BinaryNode presentNode= queue.remove(); //.....O(1)
            if (presentNode.left== null){   //.....O(1)
                presentNode.left= newNode;
                System.out.println("Successfully inserted!!");
                break;
            }
            else if (presentNode.right== null){ //.....O(1)
                presentNode.right= newNode;
                System.out.println("Successfully inserted!!");
                break;
            }
            else{   //.....O(1)
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    public BinaryNode getDeepestNode(){     // Time Complexity: O(N)
        Queue<BinaryNode> queue= new LinkedList<BinaryNode>();  //.....O(1)
        queue.add(root);    //.....O(1)
        BinaryNode presentNode= null;   //.....O(1)
        while (!queue.isEmpty()){   //.....O(N)
            presentNode= queue.remove();
            if (presentNode.left!= null){   //.....O(1)
                queue.add(presentNode.left);
            }
            if (presentNode.right!= null){  //.....O(1)
                queue.add(presentNode.right);
            }
        }
        return presentNode; //.....O(1)
    }

    public void deleteDeepestNode(){    // Time Complexity: O(N)
        Queue<BinaryNode> queue= new LinkedList<>();    //.....O(1)
        queue.add(root);    //.....O(1)
        BinaryNode previousNode, presentNode= null; //.....O(1)
        while (!queue.isEmpty()){   //.....O(N)
            previousNode= presentNode;
            presentNode= queue.remove();
            if (presentNode.left== null){   //.....O(1)
                previousNode.right= null;
                return;
            }
            else if (presentNode.right== null){ //.....O(1)
                presentNode.left= null;
                return;
            }
            queue.add(presentNode.left);    //.....O(1)
            queue.add(presentNode.right);   //.....O(1)
        }
    }

    public void deleteNode(String value){   // Time Complexity: O(N)
        Queue<BinaryNode> queue= new LinkedList<>();    //.....O(1)
        queue.add(root);    //.....O(1)
        while(!queue.isEmpty()){    //.....O(N)
            BinaryNode presentNode= queue.remove(); //.....O(1)
            if (presentNode.value==value){
                presentNode.value= getDeepestNode().value;  //.....O(N)
                deleteDeepestNode();    //.....O(N)
                System.out.println("The node is deleted successfully!!");   //.....O(1)
                return; //.....O(1)
            }
            else {
                if (presentNode.left!= null){   //.....O(1)
                    queue.add(presentNode.left);
                }
                if (presentNode.right!= null){  //.....O(1)
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The node does not exists in the Binary Tree!!");    //.....O(1)
    }

    void deleteBT(){    // Time Complexity: O(1)
        root= null; //.....O(1)
        System.out.println("BT has been successfully deleted!!");   //.....O(1)
    }

}
