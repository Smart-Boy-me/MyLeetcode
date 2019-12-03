package Hard;

class ListNode {
	       int val;
	       ListNode next;
	       ListNode(int x) { val = x; }
	   }

public class leetcode_23 {
	
	 public ListNode mergeTwoLists(ListNode L1, ListNode L2) {
			ListNode L = new ListNode(0);
			ListNode p = L;
			while(L1 != null && L2 != null) {
				if(L1.val <= L2.val) {
					p.next = new ListNode(L1.val);
					L1 = L1.next;
				}
				else {
					p.next = new ListNode(L2.val);
					L2 = L2.next;
				}
				p = p.next;
			}
			if(L1 != null) p.next = L1;
			if(L2 != null) p.next = L2;
			return L.next;
		}
		
		public ListNode mergeKLists(ListNode[] lists) {
			if(lists.length == 0) return null;
			if(lists.length == 1) return lists[0];
			int n = lists.length;
			for(int d=1;d<n;d*=2) {
				for(int i=0;i<n-d;i+=2*d) {
					lists[i] = mergeTwoLists(lists[i], lists[i+d]);
				}
			}
	        return lists[0]; 
	    }
		
		public static void main(String[] args) {
			ListNode l1 = new ListNode(1);
			l1.next = new ListNode(4);
			l1.next.next = new ListNode(5);
			ListNode l2 = new ListNode(1);
			l2.next = new ListNode(3);
			l2.next.next = new ListNode(4);
			ListNode l3 = new ListNode(2);
			l3.next = new ListNode(6);
			ListNode[] lists = {l1,l2,l3};
			leetcode_23 leetcode_23 = new leetcode_23();
			ListNode p = leetcode_23.mergeKLists(lists);
			while(p!=null) {
				System.out.print(p.val+"  ");
				p = p.next;
			}
		}
}
