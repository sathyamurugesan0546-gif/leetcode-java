// Pattern: Hashing
// Idea: Use complement lookup to find indices in one pass
// Time: O(n), Space: O(n)

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int current=nums[i];
            int x=target-current;
            if(map.containsKey(x)){
                int result[]={map.get(x), i};
                return result;
            }
            else{
                map.put(current, i);
            }
        }
        return null;
    }
}