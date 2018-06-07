import java.util.ArrayList;


public class Solution {

	private static ArrayList<Integer> result = new ArrayList<Integer>();


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
				while(null != temp.next) {
					 temp = temp.next;
				}
				temp.next = node;
			}

		}
	}

	public static ArrayList<Integer> printTail2Head(Link link) {
		
		if (null == link || null == link.head) {
			return result;
		}else {
			return printTail2Head(link.head);
		}
		
	}

	public static ArrayList<Integer> printTail2Head(ListNode node) {
		ListNode temp = node;
			if(null != temp) {
				printTail2Head(temp.next);
				result.add(temp.val);
			}
			return result;
			
		}
	

	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode a = solution.new ListNode(1);
		ListNode b = solution.new ListNode(2);
		ListNode c = solution.new ListNode(3);
		ListNode d = solution.new ListNode(4);
		Link link = solution.new Link();
		link.addListNode(a);
		link.addListNode(b);
		link.addListNode(c);
		link.addListNode(d);

		for(Integer i : printTail2Head(link)) {
			System.out.println(i);
		}

	}
}
