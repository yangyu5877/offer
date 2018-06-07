import java.util.ArrayList;


public class Solution {


	class ListNode {
		int val ;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
	class Link {
		ListNode head = null;
		void addListNode(ListNode node) {
			if (null == head) {
				head = node;
				return;
			}else {
				ListNode temp = head;
				while(null != head.next) {
					 temp = temp.next;
				}
				temp.next = node;
			}

		}
	}

	public static ArrayList<Integer> printTail2Head(Link Link) {
		ArrayList<Integer> result = new ArrayList<Integer>();



		return result;


	}


	public static void main(String[] args) {
		
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		Link link = new Link();
		link.addListNode(a);
		link.addListNode(b);
		link.addListNode(c);
		link.addListNode(d);

	}
}
