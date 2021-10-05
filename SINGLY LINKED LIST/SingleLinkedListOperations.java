package Udemy.SingleLinkedList;

public class SingleLinkedListOperations {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){    // Time Complexity: O(1)
        head= new Node();  //.........................O(1)
        Node node= new Node(); //.........................O(1)
        node.next=null;  //.........................O(1)
        node.value=nodeValue;  //.........................O(1)
        head=node;  //.........................O(1)
        tail=node;  //.........................O(1)
        size=1;  //.........................O(1)

        return head;  //.........................O(1)
    }
    public void insertInLinkedList(int nodeValue, int location){  // Time Complexity: O(N)
        Node node= new Node(); //................................O(1)
        node.value= nodeValue; //................................O(1)
        if(head== null){  //................................O(1)
            createSinglyLinkedList(nodeValue);
            return;
        }
        else if (location==0){  //................................O(1)
            node.next= head;
            head= node;
        }
        else if (location>=size){  //................................O(1)
            node.next=null;
            tail.next=node;
            tail= node;
        }
        else {
            Node tempNode= head;  //................................O(1)
            int index=0;  //................................O(1)
            while (index< location-1){  //................................O(N)
                tempNode= tempNode.next;
                index++;
            }
            Node nextNode= tempNode.next;  //................................O(1)
            tempNode.next= node;  //................................O(1)
            node.next= nextNode;  //................................O(1)
        }
        size++;  //................................O(1)
    }

    public void transverseSingleLinkedList(){  //Time Complexity: O(N)
        if (head== null){  //.............................O(1)
            System.out.println("Single Linked List does not exist.");
        }
        else {
            Node tempNode= head; //.............................O(1)
            for (int i=0; i<size; i++){ //.............................O(N)
                System.out.print(tempNode.value);
                if (i!= size-1){  //.............................O(1)
                    System.out.print("-->");
                }
                tempNode= tempNode.next;  //.............................O(1)
            }
        }
        System.out.println("\n");  //.............................O(1)
    }

    boolean searchNodeValue(int nodeValue){  // Time Complexity: O(N)
        if (head!= null){   //.............................O(1)
            Node tempNode= head;  //.............................O(1)
            for (int i=0; i<size; i++){  //.............................O(N)
                if (tempNode.value== nodeValue){  //.............................O(1)
                    System.out.println("Found the node at location:"+i+"\n");
                    return true;
                }
                tempNode= tempNode.next;  //.............................O(1)
            }
        }
        System.out.println("Node not found");  //.............................O(1)
        return false;
    }

    public void deletionOfNode(int location){       // Time Complexity: O(N)
        if (head== null){   //...........................................O(1)
            System.out.println("The SLL does not exists.");
            return;
        }
        else if (location==0){  //..........................................O(1)
            head= head.next;   //.............................O(1)
            size--;
            if (size==0){   //.............................O(1)
                tail= null;
            }
        }
        else if (location>= size){  //..................................................O(N)
            Node tempNode= head;    //.............................O(1)
            for (int i = 0; i < size - 1; i++) {    //.............................O(N)
                tempNode= tempNode.next;    //.............................O(1)
            }
            if (tempNode== head){   //............................................O(1)
                head= tail= null;
                size--;
                return;
            }
            tempNode.next= null;    //.............................O(1)
            tail= tempNode; //.............................O(1)
            size--; //.............................O(1)
        }
        else {      //...................................................................O(N)
            Node tempNode= head;    //.............................O(1)
            for (int i = 0; i < location - 1; i++) {    //.............................O(N)
                tempNode= tempNode.next;
            }
            tempNode.next= tempNode.next.next;  //.............................O(1)
            size--; //.............................O(1)
        }
    }

    public void deleteSLL(){    // Time Complexity: O(1)
        head= null;     //.............................O(1)
        tail= null;     //.............................O(1)
        System.out.println("The SLL deleted successfully!!");   //.............O(1)
    }
    
}
