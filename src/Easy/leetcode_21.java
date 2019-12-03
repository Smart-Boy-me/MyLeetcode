package Easy;

class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
}

public class leetcode_21 {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode cur = l3;
        ListNode p = l1;
        ListNode q = l2;
        while(p!=null && q!= null) {
        	if(p.val <= q.val) {
        		cur.next = p;
        		p = p.next;
        	}
        	else {
        		cur.next = q;
        		q = q.next;
        	}
        	cur = cur.next;
        }
        if(p!=null) cur.next = p;
        if(q!=null) cur.next = q;
        
        return l3.next;
    }
	
}
