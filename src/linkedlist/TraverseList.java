package linkedlist;


public class TraverseList {

	public static void traverse(ListNode head) {
		ListNode ptr=head;
		while(ptr!=null) {
			System.out.print(ptr.val+"->");
			ptr=ptr.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(56);
		ListNode l2=new ListNode(66);
		ListNode l3=new ListNode(68);
		ListNode l4=new ListNode(78);
		ListNode l5=new ListNode(53);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=null;
		
		ListNode head=l1;
		
		traverse(head);
	}
	
}
