package Medium;
import Medium.ListNode;

public class leetcode_24 {
	public ListNode swapPairs(ListNode head) {
		if(head == null) return null;
		if(head.next == null) return head;
		ListNode L = head.next;
        ListNode pre = head;
        while(pre!=null && pre.next!=null) {
        	ListNode cur = pre.next;
        	ListNode pos = cur.next;
        	cur.next = pre;
        	if(pos != null && pos.next != null) pre.next = pos.next;
        	else pre.next = pos;
        	pre = pos;
        }
        return L;
    }
}
