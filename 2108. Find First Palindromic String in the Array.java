class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            int left=0;
            int right=word.length()-1;
            boolean flag=false;
            while(left<=right){
                if(word.charAt(left)==word.charAt(right)){
                    flag=true;
                    right--;
                    left++;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                return word;
            }
        }
        return "";
    }
}