package leetcode;
//Divide and Conquer algorithm
public class MergekSortedLists {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int d)
        {
            this.val = d;
            this.next=null;
        }
    }
    static ListNode merge2Lists(ListNode l1, ListNode l2)
    {
        if (l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                temp.next = l1;
                l1=l1.next;
            }
            else {
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1!=null)
            temp.next=l1;
        if(l2!=null)
            temp.next=l2;
        return res.next;
    }
    static ListNode mergeListRecur(int left, int right, ListNode[] lists)
    {
        if(left==right)
            return lists[left];
        int mid = left + (right-left) / 2;
        ListNode l1 = mergeListRecur(left,mid,lists);
        ListNode l2 = mergeListRecur(mid+1, right, lists);
        return merge2Lists(l1,l2);
    }
    static ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n==0)
            return null;
        return mergeListRecur(0,n-1,lists);
    }
    static void displayLinkedList(ListNode head)
    {
        while(head!=null)
        {   
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);

        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);

        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        ListNode res = mergeKLists(lists);
        displayLinkedList(res);
    }
}
