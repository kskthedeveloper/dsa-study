package org.me.datastructure.linkedlist;

public class LinedListMain {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);


        myLinkedList.linkedListReversalRecursive(myLinkedList.get(0));
        myLinkedList.printList();

    }
}
