package Udemy.CircularDoublyLinkedList;

public class CircularDoublyLinkedListOperations {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public DoublyNode createDLL(int nodeValue){ // Time Complexity: O(1)
        head= new DoublyNode(); //..............O(1)
        DoublyNode newNode= new DoublyNode();   //..............O(1)
        newNode.value= nodeValue;   //..............O(1)
        head= newNode;  //..............O(1)
        tail= newNode;  //..............O(1)
        newNode.next= newNode;  //..............O(1)
        newNode.prev= newNode;  //..............O(1)
        size=1; //..............O(1)

        return head;    //..............O(1)
    }

    public void insertNode(int nodeValue, int location){    // Time Complexity: O(N)
        DoublyNode newNode= new DoublyNode();   //...................O(1)
        newNode.value= nodeValue;   //...................O(1)

        if (head== null){   //...................O(1)
            createDLL(nodeValue);
            return;
        }
        else if (location==0){
            newNode.next= head; //...................O(1)
            newNode.prev= tail; //...................O(1)
            head.prev= newNode; //...................O(1)
            tail.next= newNode; //...................O(1)
            head= newNode;  //...................O(1)
        }
        else if (location>= size){
            newNode.next= head; //...................O(1)
            newNode.prev= tail; //...................O(1)
            head.prev= newNode; //...................O(1)
            tail.next= newNode; //...................O(1)
            tail= newNode;  //...................O(1)
        }
        else {
            DoublyNode tempNode= head;  //...................O(1)
            for (int i = 0; i < location - 1; i++) {    //...................O(N)
                tempNode= tempNode.next;
            }
            newNode.next=tempNode.next; //...................O(1)
            newNode.prev= tempNode; //...................O(1)
            tempNode.next.prev= newNode;    //...................O(1)
            tempNode.next= newNode; //...................O(1)
        }
        size++; //...................O(1)
    }

    public void transversalCDLL(){  // Time Complexity: O(N)
        DoublyNode currNode= head;  //............O(1)
        if (head!= null) {
            for (int i = 0; i < size; i++) {    //................O(N)
                System.out.print(currNode.value);   //.........O(1)
                if (i != size - 1) {    //............O(1)
                    System.out.print("-->");    //............O(1)
                }
                currNode = currNode.next;   //............O(1)
            }
        }
        else {  //............O(1)
            System.out.println("The CDLL does not exists!! ");
        }
        System.out.println();   //............O(1)
    }

    public void reverseTraversalCDLL(){     // Time Complexity: O(N)
        if(head!= null){
            DoublyNode tempNode= tail;  //.............O(1)
            for (int i = 0; i < size; i++) {    //.............O(N)
                System.out.print(tempNode.value);
                if (i!= size-1){    //.............O(1)
                    System.out.print("<--");
                }
                tempNode= tempNode.prev;    //.............O(1)
            }
        }
        else {
            System.out.println("The CDLL does not exists!!");   //.............O(1)
        }
        System.out.println();   //.............O(1)
    }

    public boolean searchNode(int nodeValue){   // Time Complexity: O(N)
        if (head!= null){
            DoublyNode tempNode= head;  //.............O(1)
            for (int i = 0; i < size; i++) {    //.............O(N)
                if (nodeValue== tempNode.value){    //.............O(1)
                    System.out.println("Node found at index :"+i);
                    return true;
                }
                tempNode= tempNode.next;    //.............O(1)
            }
        }
        System.out.println("Node not found");   //.............O(1)
        return false;   //.............O(1)
    }

    public void deleteNode (int location){  // Time Complexity: O(N)
        if (head== null){   //..............O(1)
            System.out.println("The CDLL does not exists!!");
            return;
        }
        else if (location==0){  //..............O(1)
            if (size==1){   //..............O(1)
                head.prev= null;
                head.next= null;
                head= tail= null;
                size--;
                return;
            }
            else {  //..............O(1)
                head= head.next;
                head.prev= tail;
                tail.next= head;
                size--;
            }
        }
        else if (location>= size){  //..............O(1)
            if (size==1){   //..............O(1)
                head.prev= null;
                head.next= null;
                head= tail= null;
                size--;
                return;
            }
            else {  //..............O(1)
                tail= tail.prev;
                tail.next= head;
                head.prev= tail;
                size--;
            }
        }
        else {
            DoublyNode currNode= head;  //..............O(1)
            for (int i = 0; i < location-1; i++) {  //..............O(N)
                currNode= currNode.next;
            }
            currNode.next= currNode.next.next;  //..............O(1)
            currNode.next.prev= currNode;   //..............O(1)
            size--; //..............O(1)
        }
    }

    public void deleteCDLL(){   // Time Complexity: O(N)
        DoublyNode tempNode= head;  //............O(1)
        for (int i = 0; i < size; i++) {    //............O(N)
            tempNode.prev= null;
            tempNode= tempNode.next;
        }
        head= null; //............O(1)
        tail= null; //............O(1)
        System.out.println("The CDLL has been deleted successfully!!"); //............O(1)

    }
}










































