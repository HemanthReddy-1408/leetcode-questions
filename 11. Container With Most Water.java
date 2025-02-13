class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxa=0;
        int right=n-1;
        int left=0;
        while(left<right){
            int minh=Math.min(height[left],height[right]);
            int area=minh*(right-left);
            maxa=Math.max(area,maxa);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxa;
    }
}