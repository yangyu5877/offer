public class Solution {
		/**
	type	:	树
	title	:	重建二叉树
	desc	:	输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
				假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
				例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历
				序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
					A
				B       C
			D     E	  F

			前序遍历：访问根节点，前序遍历左子树，后序遍历右子树
			中序遍历：中序遍历左子树，访问根节点，中序遍历右子树
			后序遍历：后序遍历左子树，后续遍历右子树，访问根节点
	前序遍历结果：ABDECF
	中序遍历结果：DBEAFC
	后序遍历结果：DEBFCA
		**/	

	public static void main(String[] args){}
}