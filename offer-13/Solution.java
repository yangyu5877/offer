public class Solution {
	/**
	输入一个链表，输出该链表中倒数第k个结点
	**/
	static class LinkNode {
		int val;
		LinkNode nextNode;
	}

	public static LinkNode findNode(LinkNode node, int k) {
		LinkNode node1 = node;
		LinkNode node2 = node;
		if (k == 0 || k < 0) {
			 throw new RuntimeException("输入的结点有问题");
		}
		while(k != 0) {
			if (node1.nextNode == null) {
				throw new RuntimeException("查找的结点大于链表长度");
			}
			node1 = node1.nextNode;
			k--;
		}
		while(node1.nextNode != null) {
			node1 = node1.nextNode;
			node2 = node2.nextNode;
		}
		return node2.nextNode;
	} 
	public static void main(String[] args) {
		LinkNode a = new LinkNode();
		LinkNode b = new LinkNode();
		LinkNode c = new LinkNode();
		LinkNode d = new LinkNode();
		LinkNode e = new LinkNode();
		LinkNode f = new LinkNode();
		a.val = 1;
		a.nextNode = b;
		b.val = 2;
		b.nextNode = c;
		c.val = 3;
		c.nextNode = d;
		d.val = 4;
		d.nextNode = e;
		e.val = 5;
		e.nextNode = f;
		f.val = 6;

		// System.out.println(a.nextNode.val);
		System.out.println(findNode(a, 2).val);
		System.out.println(findNode(a, 1).val);
		// System.out.println(findNode(a, 9).val);
		System.out.println(findNode(a, 0).val);

	}


	
}