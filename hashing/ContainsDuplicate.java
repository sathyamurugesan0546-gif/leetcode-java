// Problem: Contains Duplicate
// Pattern: Hashing
// Time: O(n)
// Space: O(n)

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<nums.length;i++) {
	        int current=nums[i];
			if(set.contains(current)){
			    return true;
			}
			set.add(current);
		}
		return false;
    }
}