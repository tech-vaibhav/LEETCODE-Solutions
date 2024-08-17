// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
// Given a string s, find the length of the longest 
// substring without repeating characters.
// __________________________________________________:)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet=new HashSet<>();
        int left=0; 
        int maxLength=0;

        for(int right=0; right<s.length();right++){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxLength=Math.max(maxLength, right-left+1);
        }
        return maxLength;

    }
}
