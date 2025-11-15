/*Question 1:
Given a sorted array (may contain duplicates), find the first and last index of a given number x using binary search.
Example:	arr = [2, 4, 4, 4, 6, 7, 9], x = 4
Output: 	First = 1, Last = 3
Explanation :
Modify binary search:
To find first occurrence, if arr[mid] == x, move left to check more occurrences.
To find last occurrence, if arr[mid] == x, move right to check more occurrences.
This requires two binary searches.
*/

import java.util.*;
public class DSArray1 {
    public static void main(String args[]) {
        int a[] = new int[]{2, 4, 4, 4, 6, 7, 9};
        int x = 4;
        int left = 0, right = a.length - 1, mid, index = -1;

        // Find first occurrence
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (a[mid] == x) {
                index = mid;
                right = mid - 1; // move left to find earlier occurrence
            } else if (a[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (index != -1) {
            System.out.println("First index " + index);
        } else {
            System.out.println("Element not found");
        }

        left = 0;
        right = a.length - 1;
        index = -1;

        // Find last occurrence
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (a[mid] == x) {
                index = mid;
                left = mid + 1; // move right to find later occurrence
            } else if (a[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (index != -1) {
            System.out.println("Last index " + index);
        }
    }
}