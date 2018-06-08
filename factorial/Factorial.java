public class Factorial {
	public static int factorialRecursion(int num) {
		if (num <=1) {
			return 1;
		}else {
			return num * factorialRecursion(num - 1);
		}
	}

	public static int factorialTailRecursion(int num) {
		if (num <=1) {
			return 1;
		}else {
			return factorialTailRecursionHelper(num, 1, 2, 3);
		}
	}

	private static int factorialTailRecursionHelper(int n , int first, int second, int num) {
		if (n < num) {
			return second;
		}else {
			return factorialTailRecursionHelper(n-1, n, n * second, num);
		}
	}

	public static void main(String[] args) {
		System.out.println(factorialTailRecursion(10));
		System.out.println(factorialRecursion(10));
	}
}