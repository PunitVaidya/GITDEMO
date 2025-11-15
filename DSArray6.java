/*Q6. Problem:
 Perform binary search to find the index of a given key in a sorted array.
 If the key is not found, print -1.
Example:
 Input:
 arr = {2, 4, 6, 8, 10, 12}
 key = 10
 Output: Index = 4
Logic Explanation:
Set low = 0, high = arr.length - 1.
Find mid = (low + high) / 2.
If arr[mid] == key, element found.
If arr[mid] < key, search right half.
Else, search left half.
*/

public class DSArray6{
	public static void main(String args[]){
		int a[] = new int[]{2,4,6,8,10,12};
		int key =10,index=-1;
		int l=0,r=a.length-1,mid;
		
		while(l<=r){
			mid = (l+r)/2;
			
			if(a[mid] == key){
				index = mid;
				break;
			}
			if(mid < r){
				l = mid +1;
			}
			else{
				r = mid -1;
			}
		}
		
		if(index != -1){
			System.out.print("Element found at index = "+index);
			System.out.print("Element found at index = "+index);
		}
	}
}