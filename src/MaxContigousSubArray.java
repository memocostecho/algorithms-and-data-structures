/**
 * Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
 * <p>
 * Kadane’s Algorithm:
 * <p>
 * Initialize:
 * max_so_far = 0
 * max_ending_here = 0
 * <p>
 * Loop for each element of the array
 * (a) max_ending_here = max_ending_here + a[i]
 * (b) if(max_ending_here < 0)
 * max_ending_here = 0
 * (c) if(max_so_far < max_ending_here)
 * max_so_far = max_ending_here
 * return max_so_far
 */
public class MaxContigousSubArray {


}
