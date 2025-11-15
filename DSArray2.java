/*Question 2:
Given a sorted array rotated at some pivot (like [6, 7, 1, 2, 3, 4, 5]), search for a number x using binary search.
Example:
arr = [6, 7, 1, 2, 3, 4, 5], x = 3
Output: Found at index 4
Explanation:
In rotated arrays, one half (left or right) is always sorted.
Check which half is sorted:
If arr[left] <= arr[mid], left part is sorted.
Else, right part is sorted.
Decide which half to discard based on x.
*/
import java.util.*;
public class DSArray2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a[] = {6, 7, 1, 2, 3, 4, 5};
		System.out.println("Enter Search element : ");
        int skey = sc.nextInt();
        int l = 0, r = a.length - 1, mid, index = -1;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (a[mid] == skey) {
                index = mid;
                break;
            }
            // Check if left half is sorted
            if (a[l] <= a[mid]) {
                if (skey >= a[l] && skey < a[mid]) {
                    r = mid - 1;  // search left half
                } else {
                    l = mid + 1;  // search right half
                }
            }
            // Else right half is sorted
            else {
                if (skey > a[mid] && skey <= a[r]) {
                    l = mid + 1;  // search right half
                } else {
                    r = mid - 1;  // search left half
                }
            }
        }

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
