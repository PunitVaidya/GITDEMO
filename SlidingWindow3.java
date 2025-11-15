/*3. Average of All Subarrays of Size K
Example:
Input: arr = [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
Output: [2.2, 2.8, 2.4, 3.6, 2.8]*/

public class SlidingWindow3{
	public static void main(String []args){
		int a[]= new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2};
		int k=3,sum=0;
		
		for(int i=0;i<k;i++){
			sum = sum +a[i];
		}
		float avg = (float)sum/k;
		System.out.println(sum+" -> "+avg);
		
		for(int i=k;i<a.length;i++){
			sum = sum + a[i] - a[i-k];
			avg = (float)sum/k;
			System.out.println(sum+" -> "+avg);
		}
	}
}