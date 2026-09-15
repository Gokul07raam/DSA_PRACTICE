class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        
        int t_sum = 0;
        for (int i = 0; i < k; i++) {
            t_sum += nums[i];
        }

        int maxx = t_sum;

        for (int i = k; i < n; i++) {
            t_sum += nums[i];
            t_sum -= nums[i - k];
            maxx = Math.max(maxx, t_sum);
        }

        return (double) maxx / k;
    }
}