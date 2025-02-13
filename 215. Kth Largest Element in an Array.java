class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a1,a2)->a2-a1);
        int i=0;
        while(i<nums.length){
            pq.add(nums[i]);
            i++;
        }
        int j=1;
        int res=0;
        while(j<=k){
            if(j==k){
                return pq.poll();
            }
            pq.poll();
            j++;
        }
        return -1;

    }
}