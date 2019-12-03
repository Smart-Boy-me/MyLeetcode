package Medium;

class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
 }

public class Leetcode_19 {
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p = head;
		ListNode q = head;
		for(int i=0;i<n;i++) {
			p = p.next;
		}
		if(p==null) return head.next;
		while(p!=null) {
			p = p.next;
			if(p!=null) q = q.next;
		}
		q.next = q.next.next;
		return head;
    }
	
	
	
}
