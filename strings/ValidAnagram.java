// Pattern: Frequency Counting (Hashing with Array)
// Key idea: Count chars from s, consume with t
// Mapping: index = char - 'a'  (a→0 ... z→25)
// Rule: If any count goes negative → not anagram
// Optimization: Equal length + no negatives ⇒ all counts zero
// Time: O(n), Space: O(1)


class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
            int arr[]=new int[26];
            for(int i=0;i<s.length();i++){
                char character=s.charAt(i);
                int index=character-'a';
                arr[index]++;
            }
            for(int j=0;j<t.length();j++){
                char character=t.charAt(j);
                int index=character-'a';
                arr[index]--;
                if(arr[index]<0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}