// https://leetcode.com/problems/number-complement/description/?envType=daily-question&envId=2024-08-22
// The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

// For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
// Given an integer num, return its complement.
//   ______________________________________________________________________________________________________________________________________________________:)
class Solution {
    public int findComplement(int num) {
        int len=(int)(Math.log(num)/Math.log(2))+1;
        int mask=(1<<len)-1;
        return mask^num;
    }
}

// ______________________________________________________________________________:)
// // SIMILIAR QUESTION 1009. Complement of Base 10 Integer
// https://leetcode.com/problems/complement-of-base-10-integer/description/?source=submission-ac
