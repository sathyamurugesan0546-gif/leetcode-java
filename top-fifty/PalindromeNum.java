// Pattern: Reverse Integer
// Key idea: Reverse all digits and compare with the original number.
// Invariant: rev stores the reversed digits processed so far.
// Edge case: Negative numbers are never palindromes.
// Limitation: Full reversal can overflow for large integers.
// Time: O(log10 n)
// Space: O(1)

class PalindromeNum {
    public boolean isPalindrome(int x) {
        int org=x;
        int rev=0;
        if(x<0){
            return false;
        }
        while(x>0){
            int digit = x%10;
            rev=rev*10+digit;
            x /= 10;
        }
        return rev == org;
    }
}