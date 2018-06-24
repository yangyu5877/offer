import java.util.Stack;

public class Solution {
	/**
	翻转链表，输出新的链表头
	**/
	static class LinkNode {
		int val;
		LinkNode next;
	}
	//自己通过栈的方式实现的
	public static LinkNode revertLinkNode(LinkNode node) {
		
		if (node.next == null) {
			return node;
		}
		LinkNode tailNode = null;
		Stack<LinkNode> stacks = new Stack<LinkNode>();
		stacks.push(tailNode);

		while(node.next != null) {
			stacks.push(node);
			node = node.next;
		}
		stacks.push(node);


		LinkNode newLinkNode = stacks.pop();
		LinkNode tempNode = newLinkNode;
		while(!stacks.empty()) {
			LinkNode popNode = stacks.pop();
			tempNode.next = popNode;
			tempNode = popNode;
		}
		return newLinkNode;
	}

	//通过尾插法
	public static LinkNode revertLinkNode2(LinkNode node) {

		LinkNode tailNode = null;
		LinkNode next;

		if (node == null || node.next == null) {
			return null;
		}

		while(node.next != null) {
			next = node.next;
			node.next = tailNode;
			tailNode = node;
			node = next;
		}
		node.next = tailNode;
		return node;
	}


	public static LinkNode revertLinkNode3(LinkNode node) {
		LinkNode newNode = null;

		LinkNode prev = null;

		LinkNode curr,  next;
		
		curr = node;

		//关键要理解将curr赋值给newNode后， 在curr上做操作，然后再变更curr指向
		while(curr != null) {
			newNode = curr;
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return newNode;
	}




	public static void main(String[] args) {
		LinkNode a = new LinkNode();
		
		LinkNode b = new LinkNode();

		LinkNode c = new LinkNode();
		a.val = 1;
		a.next = b;
		b.val = 2;
		b.next = c;
		c.val = 3;

		LinkNode node = revertLinkNode(a);
		// LinkNode node2 = revertLinkNode2(a);
		// LinkNode node3 = revertLinkNode3(a);
		System.out.println(node.next.next.val);   
		// System.out.println(node2.next.next.val);
		// System.out.println(node3.next.val);
	}
	
	
}