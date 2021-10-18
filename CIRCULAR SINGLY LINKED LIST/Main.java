package Udemy.CircularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedListOperation csll= new CircularSinglyLinkedListOperation();
        csll.createCSLL(5);
        csll.insertCSLL(4, 0);
        csll.insertCSLL(6, 2);
        csll.insertCSLL(7, 3);
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);
        csll.traversalCSLL();
        csll.searchCSLL(6);
//        csll.deleteNode(0);
        csll.deleteCSLL();
        csll.traversalCSLL();
    }
}
