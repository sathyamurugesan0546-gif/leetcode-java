// Pattern: Math (Factor Counting)
// Core move: Repeatedly divide n by 5 and accumulate
// Formula: n/5 + n/25 + n/125 + ...
// Time: O(log₅ n)
// Space: O(1)

class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0){
            n=n/5;
            count+=n;
        }
        return count;
    }
}