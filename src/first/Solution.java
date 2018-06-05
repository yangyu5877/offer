
public class Solution {
	
		/**
	type	:	数组
	title	:	二维数组中的查找
	desc	:	在一个二维数组中，每一行都按照从左到右递增的顺序排序，
				每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
				判断数组中是否含有该整数
		**/
	public boolean find(int [][] arr, int target) {
		boolean result = false;
		//数组的行数与列数
		int rowNums = arr.length;
		int colNums = arr[0].length;
		//开始执行查找的地方
		int row = 0;
		int col = colNums - 1;
		//循环的范围条件
		while(rowNums >= 0 && row < rowNums && col < colNums && col > 0) {
			if(target == arr[row][col]) {
				result = true;
				return result;
			}else if(target > arr[row][col]) {
				row ++;
			}else {
				col--;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int [][] arr = {
			{1,5,7,9,18},{2,8,13,21,31},{3,10,20,32,41},{4,15,54,61,98},{5,26,71,88,101}
		};
		System.out.println(find(arr, 9));
		System.out.println(find(arr, 101));
		System.out.println(find(arr, 1));
		System.out.println(find(arr, 17));
	}

	
}



