
public class Solution1 {
	
		/**
	type	:	����
	title	:	��ά�����еĲ���
	desc	:	��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
				ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ��������
				�ж��������Ƿ��и�����
		*/
	public static boolean find(int [][] arr, int target) {
		
		boolean result = false;
		//�ȶԴ���
		int compareNum =0;
		//���������������
		int rowNums = arr.length;
		int colNums = arr[0].length;
		//��ʼִ�в��ҵĵط�
		int row = 0;
		int col = colNums - 1;
		//ѭ���ķ�Χ����
		while(rowNums >= 0 && row < rowNums && col < colNums && col >= 0) {
			if(target == arr[row][col]) {
				result = true;
				compareNum++;
				System.out.println("����1�ȶԴ���Ϊ��" + compareNum);
				
				return result;
			}else if(target > arr[row][col]) {
				compareNum++;
				row ++;
			}else {
				compareNum++;
				col--;
			}
		}
		System.out.println("����1�ȶԴ���Ϊ��" + compareNum);
		return result;
	}
	//������ά����
	public static boolean find2(int [][] arr, int target) {
		boolean result = false;
		//�ȶԴ���
		int compareNum2 = 0;
		int rowNums = arr.length;
		int colNums = arr[0].length;
		for(int i = 0; i < rowNums; i++) {
			for(int j = 0; j < colNums; j++) {
				if(target == arr[i][j]) {
					result = true;
					compareNum2++;
					System.out.println("����2�ȶԴ���Ϊ��" + compareNum2);
					return result;
				}
				compareNum2++;
			}
			compareNum2++;
		}
		System.out.println("����2�ȶԴ���Ϊ��" + compareNum2);
		return result;
	} 
	
	
	
	
	public static void main(String[] args) {
		int [][] arr = {
			{1,5,7,9,18},{2,8,13,21,31},{3,10,20,32,41},{4,15,54,61,98},{5,26,71,88,101}
		};
		System.out.println("��������9");
		System.out.println(find(arr, 9));
		System.out.println(find2(arr, 9));
		System.out.println("��������101");
		System.out.println(find(arr, 101));
		System.out.println(find2(arr, 101));
		System.out.println("��������1");
		System.out.println(find(arr, 1));
		System.out.println(find2(arr, 1));
		System.out.println("��������17");
		System.out.println(find(arr, 17));
		System.out.println(find2(arr, 17));
	}

	
}



