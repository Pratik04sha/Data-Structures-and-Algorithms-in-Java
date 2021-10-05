package Udemy.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedListOperations sll= new SingleLinkedListOperations();
        sll.createSinglyLinkedList(5);
//        System.out.println(sll.head.value);
        sll.insertInLinkedList(6,0);
//        System.out.println(sll.head.value);
        sll.insertInLinkedList(4,1);
//        System.out.println(sll.head.next.value);
        sll.insertInLinkedList(3,2);
        sll.insertInLinkedList(7,3);
        sll.insertInLinkedList(1,7);
        sll.transverseSingleLinkedList();
        sll.searchNodeValue(3);
        sll.deletionOfNode(3);
        sll.transverseSingleLinkedList();
        sll.deleteSLL();
        sll.transverseSingleLinkedList();

    }
}
