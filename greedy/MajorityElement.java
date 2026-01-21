// Pattern: Majority Vote (Boyer–Moore)
// Key idea: Cancel out different elements; survivor must be majority
// Invariant: counter = votes_for_candidate − votes_against
// Reset rule: counter == 0 → pick new candidate
// Assumption: Majority element (> n/2) is guaranteed
// Time: O(n), Space: O(1)

class MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int counter=1;
        for(int i=1;i<nums.length;i++){
            if(candidate==nums[i]){
                counter++;
            }
            else{
                counter--;
            }
            if(counter==0){
                candidate =nums[i];
                counter=1;
            }
        }
        return candidate;
    }
}