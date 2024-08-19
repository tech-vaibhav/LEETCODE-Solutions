// https://leetcode.com/problems/2-keys-keyboard/description/?envType=daily-question&envId=2024-08-19
// There is only one character 'A' on the screen of a notepad. You can perform one of two operations on this notepad for each step:

// Copy All: You can copy all the characters present on the screen (a partial copy is not allowed).
// Paste: You can paste the characters which are copied last time.
// Given an integer n, return the minimum number of operations to get the character 'A' exactly n times on the screen.
// ___________________________________________________________________________________________________________________________:)

class Solution {
    public int minSteps(int n) {
        int ans=0;
        for(int factors=2; factors*factors<=n; factors++){
            while(n%factors==0){
                ans+=factors;
                n/=factors;
            }
        }
        if(n>1){
            ans+=n;
        }
        return ans;
    }
}
