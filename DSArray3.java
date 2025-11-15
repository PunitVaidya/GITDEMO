/*Question 3:
Given an integer n, find its floor square root using binary search.
Example:
 n = 17
 Output: 4 (since 4² = 16 ≤ 17 < 25)
Explanation:
Apply binary search between 1 and n.
If mid * mid == n, answer found.
If mid * mid < n, move right, but store mid as possible answer.
If mid * mid > n, move left.
*/

public class DSArray3 {
    public static void main(String args[]) {
        int n = 17;
        int l = 1, r = n, res = 0;
        while (l <= r) {
            int mid = l+(r-l)/ 2;
			System.out.println(mid);
            if (mid * mid == n) {
                res = mid; 
                break;
            }
            if (mid*mid<n) {
                res = mid; 
                l = mid+1;
            } 
			else{
                r = mid-1; 
            }
        }
        System.out.println("Floor square root of " + n + " = " + res);
    }
}