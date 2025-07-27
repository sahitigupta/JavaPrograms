package linkedlist;

class Node {
    int data;
    Node next;
    Node (int d) {
        this.data = d;
        this.next = null;
    }
}

public class NodeAdditionLinkedList {
    static Node addNodeAtFront(Node head, int num) {    //time: O(1) space: O(1)
        if (head ==null)
        {
            head = new Node(num);
            return head;
        }
        Node newNode = new Node(num);
        newNode.next=head;
        head=newNode;
        return head;
    }
    Node addNodeAtEnd(Node head, int num)   //time: O(n) space: O(1)
    {
        if (head == null) {
            head = new Node(num);
            return head;
        }
        Node newNode = new Node(num);
        Node temp = head;
        while (temp.next !=null) {
            temp= temp.next;
        }
        temp.next = newNode;
        return head;
    }
    Node addNodeAtPosition(Node head, int pos, int num) //time: O(n) space: O(1)
    {
        if (pos < 1) {
            System.out.println("Invalid position");
            return head;
        }
        Node newNode = new Node(num);
        if (pos == 1)
        {
            newNode.next=head;
            head=newNode;
            return head;
        }
        Node temp = head;
        for (int i=1; i<pos-1 && temp!=null; i++)
        {
            temp = temp.next;
        }
        if (temp==null)
        {
            System.out.println("Position out of bounds.");
            return head;
        }
            

        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }
    Node addNodeAtMiddle(Node head, int num)    //time: O(n) space: O(1)
    {
        if(head == null)
            return head;
        
        Node temp1 = head;
        Node temp2 = head.next;

        while (temp2 != null && temp2.next!=null)
        {
            temp2 = temp2.next.next;
            temp1 = temp1.next;
        }
        Node newNode = new Node(num);
        newNode.next = temp1.next;
        temp1.next = newNode;
        return head;
    }
    static void displayLinkedList(Node head) {
        if (head == null) {
            System.out.println("Linked list is empty");
        }
        else {
            while(head != null)
            {
                System.out.print(head.data+" ");
                head = head.next;
            }
        }
    }
    public static void main(String args[])
    {
        NodeAdditionLinkedList ll = new NodeAdditionLinkedList();
        Node head = null;
        head = addNodeAtFront(head,5);
        head = addNodeAtFront(head,453);
        head = ll.addNodeAtEnd(head,15);
        head = ll.addNodeAtPosition(head, 2, 96);
        head = ll.addNodeAtPosition(head, 3, 30);
        head = ll.addNodeAtMiddle(head,68);
        displayLinkedList(head);
    }
}
