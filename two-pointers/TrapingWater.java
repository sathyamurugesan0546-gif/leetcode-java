// Pattern: Two Pointers with Boundary Tracking
// Key idea: Water level at any index is limited by the SMALLER boundary
// Formula: water[i] = min(leftMax, rightMax) - height[i]
// Core move: Move the pointer whose max boundary is smaller
// Why smaller side? Because the shorter wall controls water level (spill point)
// Invariant: leftMax = highest from left so far, rightMax = highest from right so far
// Update rule: Update max first → then compute trapped water
// Loop condition: while(left < right)
// Time: O(n), Space: O(1)

class TrapingWater {
    public int trap(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int leftMax=0;
        int rightMax=0;
        int totalwater=0;
            while(left<right){
                leftMax=Math.max(leftMax,height[left]);
                rightMax=Math.max(height[right],rightMax);
                if(leftMax<rightMax){
                    int water=Math.min(leftMax,rightMax)-height[left];
                    totalwater+=water;
                    left++;
                }
                else{
                    int water=Math.min(leftMax,rightMax)-height[right];
                    totalwater+=water;
                    right--;
                }
            }
        return totalwater;
    }
}