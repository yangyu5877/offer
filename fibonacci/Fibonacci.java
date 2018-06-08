public class Fibonacci {
	public static int fibonacci(int num) {
		if(num == 0) { 
		return 1;
		}else if(num <= 2) {
			return 1;
		}else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}
	
	public static int fibonacciNew(int num) {
		if(num == 0) { 
		return 1;
		}else if(num <= 2) {
			return 1;
		}else {
			int result = 1;
			int temp = 1;
			for(int i = 3; i <= num; i++) {
				result += temp;
				temp = result -temp;
			}
			return result;
		}
	}
	//尾递归
	public static int finonacciTailRecursion(int n) {
		return finonacciTailRecursionHelp(n, 0, 1, 3);
	}

	private static int finonacciTailRecursionHelp(int n, int first, int sec, int num) {
		if (n <= 0) {
			return 0;
		}else if(n < num) {
			return sec;
		}else {
			return finonacciTailRecursionHelp(n-1, sec, first+sec, num);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("常规结果是：" + fibonacci(10));
		System.out.println("循环结果是：" + fibonacci(10));
		System.out.println("尾递归结果是：" + fibonacci(10));



		// System.out.println("结果是：" + fibonacci(1));
		// System.out.println("结果是：" + fibonacci(2));
		// System.out.println("结果是：" + fibonacci(3));
		// System.out.println("结果是：" + fibonacci(10));
		
		// long startTime = System.currentTimeMillis();
		// System.out.println("结果是：" + fibonacci(40));
		// long endTime = System.currentTimeMillis();
		// long totalTime = endTime - startTime;
		// System.out.println("ºÄÊ±£º" + totalTime);
		
		//  startTime = System.currentTimeMillis();
		// System.out.println("结果是：" + fibonacciNew(40));
		//  endTime = System.currentTimeMillis();
		// totalTime = endTime - startTime;
		
		// System.out.println("ºÄÊ±£º" + totalTime);
		
	}
}