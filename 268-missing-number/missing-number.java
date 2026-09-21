class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int sum=nums[0],count=0;
        if(nums[nums.length-1]!=nums.length){
            count=nums.length;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]-sum!=1){
                count=sum+1;
            }
            sum=nums[i];
        }
        return count;
    }
}