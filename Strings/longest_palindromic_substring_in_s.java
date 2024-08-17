// https://leetcode.com/problems/longest-palindromic-substring/description/
// Given a string s, return the longest palindromic substring in s
// ____________________________________________________________________________:)
class Solution {
    public boolean isPalindrome(String s, int i, int j){
        while(i<j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1!=ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int maxlen=0; int start=0; int end=0;
        int n=s.length();
        for(int i=0;i<n; i++){
            for(int j=i; j<n;j++){
                if(isPalindrome(s,i,j)==true){
                    if((j-i+1)>maxlen){
                        maxlen=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}
