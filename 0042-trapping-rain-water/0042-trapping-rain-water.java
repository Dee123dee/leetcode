class Solution {
    public int trap(int[] height) {
        int leftmax=height[0];
        int rightmax=height[height.length-1];
        int water=0;
        int left=0,right=height.length-1;
        while(left<right)
        {
            if(height[left]<height[right])
            {
                left++;
                leftmax=Math.max(height[left],leftmax);
                water+=leftmax-height[left];
            }
            else
            {
                right--;
                rightmax=Math.max(height[right],rightmax);
                water+=rightmax-height[right];
            }
        }
        return water;
    }
}