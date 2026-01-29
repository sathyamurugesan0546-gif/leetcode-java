// Pattern: Dynamic Programming with Max–Min Tracking
// Key idea: Product flips sign → track BOTH max and min at every index
// Core move: For each x, compute from { x, x*oldMax, x*oldMin }
// Why min matters: Negative × negative can become the new maximum
// Invariant: oldMax/oldMin = best/worst product ending at previous index
// Zero rule: Zero resets both max and min to 0 (fresh start)
// Time:O(n), Space:O(1)

class MaxProductSubArray {
    public int maxProduct(int[] nums) {
        int oldmax=nums[0];
        int oldmin=nums[0];
        int answer=nums[0];
        for(int i=1;i<nums.length;i++){
            int max=Math.max(nums[i] , Math.max(oldmax * nums[i] , oldmin * nums[i]));
            int min=Math.min(nums[i] , Math.min(oldmax * nums[i] , oldmin * nums[i]));
            answer=Math.max(answer , max);
            oldmax=max;
            oldmin=min;
        }
        return answer;
    }
}