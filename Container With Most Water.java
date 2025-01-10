class Solution {
    public int maxArea(int[] height) {
    int l = 0;
    int r = height.length-1;
    int max = Integer.MIN_VALUE;
    while(l<r)
    {
        int diff = r-l;
        int min = Math.min(height[l],height[r]);
        max = Math.max(max,diff*min);
        if(height[l]==min)
        l++;
        else
        r--;
    }  
    return max;  
    }
}