/*Q4. A peak element is greater than or equal to its neighbors. Given an array, 
find the index of any one peak element using binary search.
Example: Input: arr = [1,3,20,4,1,0] → Output: 2 (20 is a peak).
Explanation: Check middle element. If arr[mid] is greater than neighbors → peak found. 
Otherwise, move towards the side that has a greater neighbor.*/

public class DSArray4{
	public static void main(String args[]){
		int a[] = new int[]{1,3,20,4,1,0};
		int l=0,r=a.length-1,mid,res=0;
		
		while(l<=r){
			mid = l+(r-l)/2;
			
			if(a[mid-1] < a[mid] && a[mid] < a[mid+1]){
				res = mid;
				break;
			}
			if(mid < r){
				l = mid +1;
			}
			else{
				r = mid -1;
			}
		}
		System.out.println("Peak found at "+res);
	}
}