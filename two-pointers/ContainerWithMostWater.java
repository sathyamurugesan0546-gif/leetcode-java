// Pattern: Two Pointers with Greedy Elimination
// Goal: Maximize area between two vertical lines
// Core formula: area = (right - left) * min(height[left], height[right])
// Core move: Move the pointer pointing to the smaller height
// Loop condition: while (left < right)
// Time: O(n)
// Space: O(1)

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxArea=0;
        while(left<right){
            int width=right-left;
            int currentHeight=Math.min(height[left], height[right]);
            maxArea=Math.max(maxArea, width*currentHeight);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}