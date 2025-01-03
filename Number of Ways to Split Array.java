class Solution {
    public int waysToSplitArray(int[] nums) {
    long sum = 0;
    int c = 0;
    long curr = 0;
    for(int i:nums)
    sum+=i;
    for(int i=0;i<nums.length-1;i++)
    { 
    curr+=nums[i];
    if(curr>=(sum-curr))
    c++;
    }
    return c;    
    }
}