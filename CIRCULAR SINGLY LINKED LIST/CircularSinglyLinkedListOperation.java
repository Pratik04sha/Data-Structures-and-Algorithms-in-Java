package Udemy.CircularSinglyLinkedList;

public class CircularSinglyLinkedListOperation {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue){  // Time Complexity: O(1)
        head= new Node();       //.........................O(1)
        Node node= new Node();  //.........................O(1)
        node.value= nodeValue;  //.........................O(1)
        node.next= node;     //.........................O(1)
        head= node; //.........................O(1)
        tail=node;  //.........................O(1)
        size=1; //.........................O(1)
        return head;    //.........................O(1)
    }

    public void insertCSLL(int nodeValue, int location){  // Time Complexity: O(N)
        Node node= new Node(); //...................O(1)
        node.value= nodeValue; //...................O(1)
        if (head== null){   //...................O(1)
            createCSLL(nodeValue);
            return;
        }
        else if (location==0){  //...................O(1)
            node.next= head;
            head= node;
            tail.next= head;
        }
        else if (location>= size){  //...................O(1)
            tail.next= node;
            tail= node;
            tail.next= head;
        }
        else { //..........................................O(N)
            Node tempNode= head;    //.................O(1)
            int index=0;
            while (index< location-1){ //................O(N)
                tempNode= tempNode.next;
                index++;
            }
            node.next= tempNode.next;   //..............O(1)
            tempNode.next= node;    //.................O(1)
        }
        size++; //...................O(1)
    }

    public void traversalCSLL(){    // Time Complexity: O(N)
        if (head!= null){ //...................O(1)
            Node tempNode= head;  //...................O(1)
            for (int i = 0; i < size; i++) {  //...................O(N)
                System.out.print(tempNode.value);
                if (i != size - 1) {  //...................O(1)
                    System.out.print("-->");
                }
                tempNode= tempNode.next;    //...................O(1)
            }
            System.out.println();
        }
        else {  //...................O(1)
            System.out.println("The CSLL does not exists!!");
        }
    }

    public boolean searchCSLL(int nodeValue){   // Time Complexity: O(N)
        if (head!= null){  //..................O(1)
            Node tempNode= head; //..................O(1)
            for (int i = 0; i < size; i++) {    //..................O(N)
                if (tempNode.value== nodeValue ){   //..................O(1)
                    System.out.println("Node found at index "+ i);
                    return true;
                }
                else {  //..................O(1)
                    tempNode= tempNode.next;
                }
            }
        }
        System.out.println("Node not found!!"); //..................O(1)
        return false;   //..................O(1)
    }

    public void deleteNode( int location ){     // Time Complexity: O(N)
        if (head==null){    //.....................O(1)
            System.out.println("The CSLL does not exists!!");
            return;
        }
        else if (location==0){  //...................O(1)
            head= head.next;
            tail.next= head;
            size--;
            if (size==0){   //...................O(1)
                tail= null;
                head.next=null;
                head=null;
            }
        }
        else if (location>= size){
            Node tempNode= head;
            for (int i = 0; i < size-1; i++) {  //...................O(N)
                tempNode= tempNode.next;
            }
            if (tempNode== head){   //...................O(1)
                head.next=null;
                tail= head= null;
                size--;
            }
            tempNode.next= head;    //...................O(1)
            tail= tempNode; //...................O(1)
            size--; //...................O(1)
        }
        else {
            Node tempNode= head;    //...................O(1)
            for (int i = 0; i < location-1; i++) {  //...................O(N)
                tempNode= tempNode.next;
            }
            tempNode.next= tempNode.next.next;  //...................O(1)
            size--; //...................O(1)
        }
    }

    public void deleteCSLL(){       // Time Complexity: O(N)
        if (head== null){   //...................O(1)
            System.out.println("The CSLL does not exists");
        }
        else {
            head=null;  //...................O(1)
            tail.next= null;    //...................O(1)
            tail= null; //...................O(1)
            System.out.println("The CSLL has been successfully deleted!!"); //...................O(1)
        }
    }
}
