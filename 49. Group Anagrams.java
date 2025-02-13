class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String s: strs){
            char[] c1=s.toCharArray();
            Arrays.sort(c1);
            String s1=new String(c1);
            if(!map.containsKey(s1)) map.put(s1,new ArrayList<>());
            map.get(s1).add(s);
        }
        return new ArrayList<>(map.values());
    }
}