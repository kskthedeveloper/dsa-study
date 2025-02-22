package org.me.datastructure.linkedlist;


public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList() {
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
           this.value = value;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    /*
    if
        head and tail is null
        assign newNode to both
    else
        assign newNode to tail node.next
        then point the tail to newNode
     */
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail= newNode;
            length = 1;
        } else  {
            tail.next = newNode;
            tail = newNode;
            length++;
        }
    }

    /*
    Iterate the list with two pointers to get preTail Node
     */
    public Node removeLast() {
        if (length == 0) return null;

        Node pre = head;
        Node temp = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        this.tail = pre;
        this.tail.next = null;
        length--;

        if (length == 0) {
            this.head = null;
            this.tail = null;
        }

        return temp;
    }

    public void prepend(int value) {
        Node temp = new Node(value);

        if (length == 0) {
            this.head = temp;
            this.tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }


        length++;
    }

    /*
    Edge case
    1. empty list
    2. one node
     */
   /*
   public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;

        if (head.next == null) {
            this.makeEmpty();
            return temp;
        } else {
            this.head = this.head.next;
            temp.next = null;
        }

        length--;

        return temp;
    }
    */
    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }

        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = this.head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = this.get(index);

        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > this.length) return false;

        if (index == 0) {
            this.prepend(value);
            return true;
        }

        if (index == this.length) {
            this.append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);

        if (temp == null) {
            return false;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        if (index == 0) {
            return this.removeFirst();
        }

        if (index == length -1 ) {
            return this.removeLast();
        }

        Node pre = this.get(index-1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;

        Node after = null;
        Node before = null;

        for (int i = 0; i < this.length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

}
