public class Solution {
	//旋转寻找数组最小数
	/**
	把一个数组最开始的若干个元素搬到数组的末尾，
	我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，
	输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}
	的一个旋转，该数组的最小值为1。
	 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
	 **/

	 public static int minNumInArray(int[] array) {
	 	
	 	if (array.length == 0) {
	 		return 0;
	 	}

	 	int start, mid, end, result;
	 	start = 0;
	 	end = array.length - 1;
	 	mid = (start + end) / 2;
	 	result = 0;

	 	if (array[start] == array[end]) {
	 		return minNumInOrderArray(array);
	 	}

	 	while(start < end - 1) {
	 		if (array[mid] > array[start]) {
	 			start = mid;
	 			mid = (start + end) / 2;
	 		}else if (array[mid] < array[end]) {
	 			end = mid;
	 			mid = (start + end) / 2;
	 		}else {
	 			throw new RuntimeException("数据异常");
	 		}
	 		result = array[end];
	 	}
	 	return result;
	 }
	 private static int minNumInOrderArray(int[] array) {
	 	int length = array.length;
	 	int minNum = Integer.MAX_VALUE;
	 	int i = 0;
	 	while(i < length) {
	 		if (array[i] < minNum) {
	 			minNum = array[i];
	 		}
	 		i++;
	 	}
	 	return minNum;
	 }
	 public static void main(String[] args) {
	 	int[] array = {3,4,5,1,2};

	 	int[] array2 = {3,3,2,3,3};

	 	System.out.println(minNumInArray(array));
	 	System.out.println(minNumInArray(array2));

	 	 int[] array3 = {3, 4, 5, 1, 2, 2};  
        System.out.println(minNumInArray(array3)); 

        int[] array4 = {3, 4, 5, 1, 1, 2};  
        System.out.println(minNumInArray(array4)); 













	 }
	
}