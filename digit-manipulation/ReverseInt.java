// Pattern: Reverse Integer (Digit Manipulation)
// Key idea: Pop last digit, push it into reversed number
// Operations: %10 → extract, /10 → remove, *10 → shift left
// Overflow: Check before rev = rev * 10 + digit
// Time: O(log n), Space: O(1)

import java.util.*;
class ReverseInt {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            int digit=x%10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && digit > 7)){
                return 0;
            }
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && digit < -8)){
                return 0;
            }

            rev=rev*10+digit;
            x/=10;
        }
        return rev;
    }
}