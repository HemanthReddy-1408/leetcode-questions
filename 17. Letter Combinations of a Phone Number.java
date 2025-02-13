class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character,List<Character>>map=new HashMap<>();
        map.put('2',Arrays.asList('a','b','c'));
        map.put('3',Arrays.asList('d','e','f'));
        map.put('4',Arrays.asList('g','h','i'));
        map.put('5',Arrays.asList('j','k','l'));
        map.put('6',Arrays.asList('m','n','o'));
        map.put('7',Arrays.asList('p','q','r','s'));
        map.put('8',Arrays.asList('t','u','v'));
        map.put('9',Arrays.asList('w','x','y','z'));
        List<String> result = new ArrayList<>();
        if(digits.isEmpty()){
            return result;
        }
        result.add("");
        
        for(int i=0;i<digits.length();i++){
            List<Character> letters=map.get(digits.charAt(i));
            List<String> temp=new ArrayList<>();
            for(String s:result){
                for(char c:letters){
                    temp.add(s+c);
                }
            }
            result=temp;
        }
        return result;
    }
}