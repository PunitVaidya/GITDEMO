/*1. Maximum Sum Subarray of Size K
Example:
Input: arr = [2, 1, 5, 1, 3, 2], K=3
Output: 9 (subarray [5, 1, 3])
*/

public class SlidingWindow1{
	public static void main(String args[]){
		int a[] = new int[]{2, 1, 5, 1, 3, 2};
		int k = 3,sum = 0,max;
		
		for(int i=0; i<k; i++){
			sum = sum + a[i];
		}
		
		max = sum;
		for(int i=k; i<a.length; i++){
			sum = sum + a[i] - a[i-k];
			if(sum > max){
				max = sum;
			}
		}
		System.out.println("Maximum Sum Subarray = "+max);
	}
}