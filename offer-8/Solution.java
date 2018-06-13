public class Solution {
	//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
	public static int jumpFloor(int step) {
		int result = 0;
		if (step == 1) {
			return 1;
		}else if (step == 2) {
			return 2;
		}else {
			 result += jumpFloor(step - 1) + jumpFloor(step - 2);
		}
		return result;

	}
	public static void main(String[] args) {
		System.out.println(jumpFloor(10));
	}
}