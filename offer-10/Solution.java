public class Solution {
	//输入一个整数，转为二进制后，输出二进制 1 的个数
	public static int numOfone(int value) {
		int result = 0;
		//int类型是32位
		for (int i = 0; i < 32; i++) {
			result += value & 1;
			//无符号位移1位，区别有符号位移，
			//有符号位移是需要补符号位的（负数的首位为1）
			value = value >> 1;
		}
		return result;
	}

	public static int numOfone2(int value) {
		int result = 0;
		return  result;
	}



	

	public static void main(String[] args) {
		System.out.println(numOfone(-19));
		System.out.println(Integer.toBinaryString(-19));
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE - 1;

		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		


		System.out.println(a & b);

	}
}