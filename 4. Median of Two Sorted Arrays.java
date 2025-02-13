class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int t=m+n;
        int i;
        ArrayList<Integer> nums3=new ArrayList<>();
        for(i=0;i<m;i++){
            nums3.add(nums1[i]);
        }
        for(i=0;i<n;i++){
            nums3.add(nums2[i]);
        }
        Collections.sort(nums3);
        if(t%2!=0)
        return (double)nums3.get(((t+1)/2)-1);
        else
        return (double)(nums3.get(t/2)+nums3.get((t/2)-1))/2;
    }
}