public class Solution {

	//1, 1, 2, 3, 5, 8, 13
	//递归
	public static int fibonacci(int num) {
		if (num <= 2) {
			return 1;
		}else {
			return fibonacci(num - 1) + fibonacci(num - 2); 
		}
	}
	//循环
	public static int fibonacciNew(int num) {
		int first = 0;
		int sec = 0;
		int result = 0;
		if (num == 1) {
			return 1;
		}else if (num == 1) {
			return 1;
		}else {
			first = 1;
			sec = 1;
			for (int i = 3;i <= num ; i++) {
				result = first + sec;
				first = sec;
				sec = result;

			}
			return result;

		}
	}
	//尾递归
	public static int tailFibonacci(int num) {
		if (num <= 2) {
			return 1;
		}else {
			return tailFibonacci(num, 1, 1);
		}
	}
	private static int tailFibonacci(int num, int first, int sec) {
		if (num == 3) {
			return first + sec;
		}else {
			return tailFibonacci(num - 1, sec, first + sec);
		}
		
	}


	public static void main(String[] args) {
		System.out.println(fibonacci(5));

		System.out.println(fibonacci(15));
		System.out.println(fibonacciNew(15));
		System.out.println(tailFibonacci(15));
	}
}