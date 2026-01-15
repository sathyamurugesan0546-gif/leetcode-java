// Pattern: Two Pointers
// Key idea: Skip invalid chars, normalize, compare inward
// Time: O(n), Space: O(1)


class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            char l=Character.toLowerCase(s.charAt(left));
            char r=Character.toLowerCase(s.charAt(right));
            if(l != r){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}