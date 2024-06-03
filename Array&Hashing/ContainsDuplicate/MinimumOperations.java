/*
 * 2357. Make Array Zero by Subtacting Equal Amounts
 * You are given a non-negative integer array nums. In one operation, you must:
 * Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
 * Subtract x from every positive element in nums.
 * Return the minimum number of operations to make every element in nums equal to 0.
 */

package ContainsDuplicate;

import java.util.HashSet;
public class MinimumOperations {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++)   {
            if(nums[i] > 0) {
                set.add(nums[i]);
            }
        }
        return set.size();
    }
}
