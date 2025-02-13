class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int r=str.length()-1,l=0;
        if(str.length()==0) return true;
        while(r>=l){
            if(str.charAt(r)==str.charAt(l)){
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