class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            Set<Character> a=new HashSet<>();
            int j=i;
            while(j<s.length() && !a.contains(s.charAt(j))){
                a.add(s.charAt(j));
                j++;
            }
            max=Math.max(a.size(),max);
        }
        return max;
    }
}