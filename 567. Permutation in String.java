class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        int k=s1.length();
        if(s1.length()>s2.length()){
            return false;
        }
        for(char c : s1.toCharArray()){
            freq1[c-'a']++;
        }
        for(int i=0;i<k;i++){
            freq2[s2.charAt(i)-'a']++;
        }
        for(int i=k;i<=s2.length();i++){
            if(Arrays.equals(freq1,freq2)) return true;
            if(i<s2.length()){
                freq2[s2.charAt(i-k)-'a']--;
                freq2[s2.charAt(i)-'a']++;
            }
        }
        return false;
    }
}