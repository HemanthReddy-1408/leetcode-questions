class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> a=new HashSet<>();
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(a.add(nums[i]))
            nums[index++]=nums[i];
        }
        return a.size();
    }
}