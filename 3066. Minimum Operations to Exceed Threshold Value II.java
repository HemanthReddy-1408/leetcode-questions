class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        int i=0;
        while(i<nums.length){
            pq.add((long)nums[i]);
            i++;
        }
        int res=0;
        while(pq.peek()<k && pq.size()>1){
            long min=pq.poll();
            long max=pq.poll();
            pq.add(min*2+max);
            res++;
        }
        return res;
    }
}