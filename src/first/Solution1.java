
public class Solution1 {
	
		/**
	type	:	数组
	title	:	二维数组中的查找
	desc	:	在一个二维数组中，每一行都按照从左到右递增的顺序排序，
				每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
				判断数组中是否含有该整数
		*/
	public static boolean find(int [][] arr, int target) {
		
		boolean result = false;
		//比对次数
		int compareNum =0;
		//数组的行数与列数
		int rowNums = arr.length;
		int colNums = arr[0].length;
		//开始执行查找的地方
		int row = 0;
		int col = colNums - 1;
		//循环的范围条件
		while(rowNums >= 0 && row < rowNums && col < colNums && col >= 0) {
			if(target == arr[row][col]) {
				result = true;
				compareNum++;
				System.out.println("方法1比对次数为：" + compareNum);
				
				return result;
			}else if(target > arr[row][col]) {
				compareNum++;
				row ++;
			}else {
				compareNum++;
				col--;
			}
		}
		System.out.println("方法1比对次数为：" + compareNum);
		return result;
	}
	//遍历二维数组
	public static boolean find2(int [][] arr, int target) {
		boolean result = false;
		//比对次数
		int compareNum2 = 0;
		int rowNums = arr.length;
		int colNums = arr[0].length;
		for(int i = 0; i < rowNums; i++) {
			for(int j = 0; j < colNums; j++) {
				if(target == arr[i][j]) {
					result = true;
					compareNum2++;
					System.out.println("方法2比对次数为：" + compareNum2);
					return result;
				}
				compareNum2++;
			}
			compareNum2++;
		}
		System.out.println("方法2比对次数为：" + compareNum2);
		return result;
	} 
	
	
	
	
	public static void main(String[] args) {
		int [][] arr = {
			{1,5,7,9,18},{2,8,13,21,31},{3,10,20,32,41},{4,15,54,61,98},{5,26,71,88,101}
		};
		System.out.println("查找数字9");
		System.out.println(find(arr, 9));
		System.out.println(find2(arr, 9));
		System.out.println("查找数字101");
		System.out.println(find(arr, 101));
		System.out.println(find2(arr, 101));
		System.out.println("查找数字1");
		System.out.println(find(arr, 1));
		System.out.println(find2(arr, 1));
		System.out.println("查找数字17");
		System.out.println(find(arr, 17));
		System.out.println(find2(arr, 17));
	}

	
}



