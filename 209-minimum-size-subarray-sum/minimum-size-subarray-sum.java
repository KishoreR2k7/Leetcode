class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int min=Integer.MAX_VALUE,i=0,j=0,sum=0;
       for(int num:nums){
        sum+=num;
        while(sum>=target){
            min=Math.min(min,j-i+1);
            sum-=nums[i];
            i++;
        }
        j++;
       }
       return min==Integer.MAX_VALUE?0:min;
    }
}