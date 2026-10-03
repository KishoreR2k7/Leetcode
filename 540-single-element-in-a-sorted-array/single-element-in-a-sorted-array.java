class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left=0,rigth=nums.length-1;
        while(left<rigth){
            if(nums[left]==nums[left+1]){
                left+=2;
            }
            if(nums[rigth]==nums[rigth-1]){
                rigth-=2;
            }
        }
        return nums[left];
    }
}