class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int count=0, res=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                count++;
            }
            res+=count;
        }
        return res;
    }
}