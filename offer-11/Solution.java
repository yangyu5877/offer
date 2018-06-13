public class Solution {
	/**给定一个double类型的浮点数base和int类型的整数exponent。
	求base的exponent次方。

	1 exponent = 0
	2 base = 0
	3 exponent = 负数
	**/


	public static double power(double base, int exponent) {
		double result = 0.0;
		if (exponent == 0) {
			return 1;
		}else if (exponent > 0) {
				result = base;
			for (int i = 0; i < exponent - 1 ;i++ ) {
				result *= base;
			}
		}else{
			double subResult = base;
			for (int i = 0;i < -exponent - 1;i++ ) {
				subResult *= base;
			}
			System.out.println(subResult);
			result = 1 / subResult;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(power(0, 0));
		System.out.println(power(0, 19));
		System.out.println(power(2.1, 3));
		System.out.println(power(2.1, -3));
	}
}