class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,int[]> map=new HashMap<>();
        int max=-1;
        for(int num : nums){
            int sum=0;
            int temp=num;
            while(temp>0){
                sum+=temp%10;
                temp=temp/10;
            }
            if(map.containsKey(sum)){
                int[] pair=map.get(sum);
                max=Math.max(max,pair[0]+num);
                if(num>pair[0]){
                    pair[1]=pair[0];
                    pair[0]=num;
                }else if(num>pair[1]){
                    pair[1]=num;
                }
            }
            else{
                map.put(sum,new int[]{num,-1});
            }
        }
        return max;
    }
}