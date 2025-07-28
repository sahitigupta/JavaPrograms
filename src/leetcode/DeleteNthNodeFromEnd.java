package leetcode;
//t:o(n), s:o(1)
class Node {
    int data;
    Node next;
    
    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

class DeleteNthNodeFromEnd {
    static Node deleteNthNodeFromEnd(Node head, int n) {
        Node fast = head;
        Node slow = head;

        // Move the fast pointer n nodes
        for (int i = 0; i < n; i++)
            fast = fast.next;

        // If fast becomes NULL, then head 
        // is the nth node from end.
        if (fast == null)
            return head.next;

        // Move both pointers until fast reaches the end
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = deleteNthNodeFromEnd(head, 2);

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}