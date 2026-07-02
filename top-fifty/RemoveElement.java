// Pattern: Two Pointers (Fast & Slow)
// Fast pointer (i): Scans every element.
// Slow pointer (write): Tracks the next position for a valid element.
// Keep elements that satisfy the condition by copying them to nums[write].
// Skip unwanted elements.
// Return write, which equals the count of valid elements.
// Time: O(n), Space: O(1)

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int write=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[write]=nums[i];
                write++;
            }
        }
        return write;
    }
}