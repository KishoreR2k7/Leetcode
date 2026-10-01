class Solution {
    public int findPeakElement(int[] nums) {
        int peekelement=0;
        for(int i=1;i<nums.length;i++){
            if(nums[peekelement]<nums[i]){
                peekelement=i;
            }
        }
        return peekelement;
    }
}