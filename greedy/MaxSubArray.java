// Pattern: Kadane’s Algorithm (Dynamic Programming on Array)
// Key idea: Best subarray ending here = start new OR extend previous
// State: currSum = max(nums[i], currSum + nums[i])
// Global: maxSum tracks best seen so far (non-empty subarray)
// Critical rule: Negative prefix never helps future sums → drop it
// Order matters: Decide (start vs extend) FIRST, then update max
// Time: O(n), Space: O(1)

class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            sum = Math.max(nums[i], sum + nums[i]);
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
}