class Solution {
    public boolean validPalindrome(String s) {
        int l=0,r=s.length()-1;
        int count=0;
        while(l<=r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else if(count==0){
                return isPalindrome(s,l+1,r) || isPalindrome(s,l,r-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(String s,int l,int r){
        while(l<=r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}