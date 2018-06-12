public class Solution {
	public static int jumpFloor2(int step) {



		//f(n) = f(n-1) + f(n-2) + .. +f(n- n + 1) + f(n - n);
		//f(n-1) = f(n-2)+f(n-3)+.... +f(n-1-n+1+1) + f(0);
		//f(n) - f(n-1)= f(n-1);
		//f(n) = 2f(n-1);

		if(step == 1) {
			return 1;
		}else if (step == 2) {
			return 2;
		}else {
			return 2 * jumpFloor2(step - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(jumpFloor2(10));
	}
}