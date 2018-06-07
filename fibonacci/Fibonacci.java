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
	
	
	
	
	public static void main(String[] args) {
		System.out.println("结果是：" + fibonacci(0));
		System.out.println("结果是：" + fibonacci(1));
		System.out.println("结果是：" + fibonacci(2));
		System.out.println("结果是：" + fibonacci(3));
		System.out.println("结果是：" + fibonacci(10));
		
		long startTime = System.currentTimeMillis();
		System.out.println("结果是：" + fibonacci(40));
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("耗时：" + totalTime);
		
		 startTime = System.currentTimeMillis();
		System.out.println("结果是：" + fibonacciNew(40));
		 endTime = System.currentTimeMillis();
		
		
		
		
		
		
		totalTime = endTime - startTime;
		
		System.out.println("耗时：" + totalTime);
		
	}
}