public class Solution {
		

static class BinaryTreeNode {
	int value;
	BinaryTreeNode left;
	BinaryTreeNode right;
}
	public static BinaryTreeNode construct(int[] preOrder, int[] inOrder) {
		if (null == preOrder || null == inOrder || preOrder.length != inOrder.length) {
			return null;
		}
		return construct(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
	}
	private static BinaryTreeNode construct(int[] preOrder, int ps, int pe, int[] inOrder, int is, int ie) {
		
        if (ps > pe) {
            return null;
        }
        

		int val = preOrder[ps];
		int index = is;

		//查找根节点在中序遍历结果中的位置
		while (index < ie && val != inOrder[index]) {index++;}
		BinaryTreeNode node = new BinaryTreeNode();
		node.value = val;
		node.left = construct(preOrder, ps + 1, ps + index, inOrder, is, index - 1);
		node.right = construct(preOrder, ps + index -is + 1, pe, inOrder, index + 1, ie);
		return node;
	}


	public static void main(String[] args) {
		int[] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
		int[] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};
		BinaryTreeNode node = construct(preOrder, inOrder);
		preOrderTree(node);
		System.out.println("======");
		inOrderTree(node);
	}

	public static void preOrderTree(BinaryTreeNode node) {
		if (node != null) {
			System.out.println(node.value);
			preOrderTree(node.left);
			preOrderTree(node.right);
		}
	}
	// public static int[] inOrderTree(BinaryTreeNode node) {}
	public static void inOrderTree(BinaryTreeNode node) {
		if (node != null) {
			inOrderTree(node.left);
			System.out.println(node.value);
			inOrderTree(node.right);
		}
	}




	
		
}
