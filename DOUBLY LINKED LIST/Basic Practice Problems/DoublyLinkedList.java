package Practice;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    static class Node{
        Node next;
        Node prev;
        int value;
    }

    public Node createNewNode(int nodeValue){
        Node newNode= new Node();
        newNode.value= nodeValue;
        return newNode;
    }

    public void createLinkedList(int nodeValue){
        head= new Node();
        Node newNode= createNewNode(nodeValue);
        newNode.next= null;
        newNode.prev= null;
        head= tail= newNode;
        size=1;
    }

    public void addNodeAtBegin(int nodeValue){
        if (head== null){
            createLinkedList(nodeValue);
            return;
        }
        Node newNode= createNewNode(nodeValue);
        newNode.next= head;
        newNode.prev= null;
        head= newNode;
        size++;
    }

    public void addNodeAtEnd(int nodeValue){
        if (head== null){
            createLinkedList(nodeValue);
            return;
        }
        Node newNode= createNewNode(nodeValue);
        newNode.prev= tail;
        tail.next= newNode;
        tail= newNode;
        size++;
    }

    public void deleteNode(int index){
        if (head== null){
            return;
        }
        else if (index==0){
            if (size==1){
                head= null;
                tail=null;
                size--;
                return;
            }
            else {
                head= head.next;
                head.prev= null;
                size--;
            }
        }
        else if (index>= size){
            Node tempNode= tail.prev;
            if (size==1){
                head= null;
                tail=null;
                size--;
                return;
            }
            tempNode.next= null;
            tail= tempNode;
            size--;
        }
        else {
            Node tempNode= head;
            for (int i = 0; i < index-1; i++) {
                tempNode= tempNode.next;
            }
            tempNode.next= tempNode.next.next;
            tempNode.next.prev= tempNode;
            size--;
        }
    }

    public int length(){
        System.out.println(size);
        return size;
    }

    public void traversal(){
        Node curr= head;
        for (int i = 0; i < size; i++) {
            System.out.print(curr.value+" ");
            curr= curr.next;
        }
        System.out.println();
    }

    public void search(int k){
        if (head== null){
            return;
        }
        Node curr= head;
        for (int i = 0; i < size; i++) {
            if (curr.value== k){
                System.out.println("Value found at index:"+i);
                return;
            }
            curr= curr.next;
        }
        System.out.println("Value not found!!");
    }

    public void getNthNode(int n){
        if (head== null){
            return;
        }
        Node curr= head;
        for (int i = 1; i < n; i++) {
            curr= curr.next;
        }
        System.out.println("Nth Node value is: "+curr.value);
    }

    public void getCount(int nodeValue){
        int count=0;
        Node curr= head;
        for (int i = 0; i < size; i++) {
            if (curr.value== nodeValue){
                count++;
            }
            curr= curr.next;
        }
        System.out.println("Count of "+nodeValue+" in the list is: "+count);
    }

    public void getMinMax(){
        int min= head.value;
        int max= head.value;
        Node curr= head;
        for (int i = 0; i < size; i++) {
            if (curr.value< min){
                min= curr.value;
            }
            if (curr.value> max){
                max= curr.value;
            }
            curr= curr.next;
        }
        System.out.println("Minimum value of the list: "+min);
        System.out.println("Maximum value of the list: "+ max);
    }

    public void convertToCDLL(){
        head.prev= tail;
        tail.next= head;
    }

    public static void main(String[] args) {
        DoublyLinkedList d= new DoublyLinkedList();
        d.createLinkedList(5);
        d.addNodeAtBegin(4);
        d.addNodeAtBegin(3);
        d.addNodeAtBegin(8);
        d.addNodeAtEnd(10);
        d.addNodeAtEnd(15);
        d.addNodeAtEnd(15);
        d.length();
        d.traversal();
        d.search(5);
        d.getNthNode(2);
        d.getCount(15);
        d.getMinMax();
        d.deleteNode(2);
        d.traversal();
        d.convertToCDLL();
        System.out.println(d.tail.next.value);
    }
}
