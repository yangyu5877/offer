import java.util.Stack;
public class Solution {
	//两个堆栈实现队列功能
	
	Stack<Integer> stack1 = new Stack<Integer>(); 
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int value) {
		stack1.push(value);
		
	}

	public int pop() {
		int temp;
		while (!stack1.empty()) {
			temp = stack1.pop();
			stack2.push(temp);
		}
		return stack2.pop();
	}


	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4, 5, 6};
		Solution solution = new Solution();
		for (Integer i : data) {
			solution.push(i);
		}
		for(int i = 0; i < data.length; i++) {
			System.out.println(i + ":" + solution.pop() );
		}
	}
}
