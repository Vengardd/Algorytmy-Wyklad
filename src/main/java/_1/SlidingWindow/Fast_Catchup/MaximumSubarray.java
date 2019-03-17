package _1.SlidingWindow.Fast_Catchup;

public class MaximumSubarray {

    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int tab[] = {-1, -2};
        System.out.println(maximumSubarray.maxSubArray(tab));
    }

    public int maxSubArray(int[] nums) {
        int actualSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (actualSum > 0)
                actualSum += nums[i];
            else
                actualSum = nums[i];
            maxSum = Math.max(actualSum, maxSum);
        }
        return maxSum;
    }
}
