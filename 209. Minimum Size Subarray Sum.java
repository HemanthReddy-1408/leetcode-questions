class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,left=0,res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                res=Math.min(res,i-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(res==Integer.MAX_VALUE) return 0;
        return res;
    }
}