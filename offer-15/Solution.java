public class Solution {
	/**
	*
	*输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
	**/
	public static class ListNode {
		int val;
		ListNode next;

	}

	// public static ListNode mergeTwoListNode(ListNode node1, ListNode node2) {
	// 	ListNode newNode = new ListNode();

	// 	if (null == node1 && null == node2) {
	// 		return null;
	// 	}
	// 	return node1 == null ? node2 : node1;



	// 	while(node1 != null && node2 != null) {



	// 	}

	// }
	public static ListNode merge(ListNode head1, ListNode head2) {
        // 如果第一个链表为空，返回第二个链表头结点
        if (head1 == null) {
            return head2;
        }

        // 如果第二个结点为空，返回第一个链表头结点
        if (head2 == null) {
            return head1;
        }

        // 创建一个临时结点，用于添加元素时方便
        ListNode root = new ListNode();
        // 用于指向合并后的新链的尾结点
        ListNode pointer = root;

        // 当两个链表都不为空就进行合并操作
        while (head1 != null && head2 != null) {
            // 下面的操作合并较小的元素
            if (head1.val < head2.val) {
                pointer.next = head1;
                head1 = head1.next;
            } else {
                pointer.next = head2;
                head2 = head2.next;
            }

            // 将指针移动到合并后的链表的末尾
            pointer = pointer.next;
        }

        // 下面的两个if有且只一个if会内的内容会执行

        // 如果第一个链表的元素未处理完将其，接到合并链表的最后一个结点之后
        if (head1 != null) {
            pointer.next = head1;
        }

        // 如果第二个链表的元素未处理完将其，接到合并链表的最后一个结点之后
        if (head2 != null) {
            pointer.next = head2;
        }

        // 返回处理结果
        return root.next;
    }





	public static void main(String[] args) {
		ListNode node1 = new ListNode();
		ListNode node2 = new ListNode();
		ListNode node3 = new ListNode();
		ListNode node4 = new ListNode();

		node1.val = 1;
		node2.val = 3;
		node3.val = 5;
		node4.val = 7;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;


		ListNode node5 = new ListNode();
		ListNode node6 = new ListNode();
		ListNode node7 = new ListNode();
		ListNode node8 = new ListNode();

		node5.val = 1;
		node6.val = 4;
		node7.val = 6;
		node8.val = 7;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;



		// ListNode newNode = mergeTwoListNode(node1, node5);

		ListNode newNode = merge(node1, node5);


		while(newNode != null) {
			System.out.println(newNode.val);
			newNode = newNode.next;
		}







	}
}