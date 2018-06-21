public class Solution {
	/**调整数组顺序，使奇数位于偶数前面
	**/


	public static void reOrderArray(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			
			for (int j = i + 1; j < array.length - 1; j++) {
			 	
				if (!isOdd(array[i]) && isOdd(array[j])) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					break;
				}

			}
		}
	}
	public static boolean isOdd(int num) {
		if (num % 2 != 0) {
			return true;
		}else{
			return false;
		}
	}

	// public static void reOrderArray2(int [] array) {
 //        int arraylength=array.length;
 //        for(int i=1;i<arraylength;i++){
 //           int temp=array[i];
 //           int j=i-1;
 //           if(array[i]%2!=0){
 //              while(j>=0){
 //                  if(array[j]%2!=0){
 //                      break;
 //                  }
 //                 if(array[j]%2==0){
 //                     int t=array[j+1];
 //                     array[j+1]=array[j];
 //                     array[j]=t;
 //                     j--;
 //                 }
 //              }
 //           }
 //            array[j+1]=temp;
 //        }
 //    }




	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(",");

		}
	}

	public static void main(String[] args) {
		int[] testArray = {2,5,1,6,8,4,9,8};
		printArray(testArray);
		reOrderArray(testArray);
		System.out.println("===============");
		printArray(testArray);
	}
}