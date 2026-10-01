class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            boolean left=(i-k)<0||(nums[i]>nums[i-k]);
            boolean rigth=(i+k)>nums.length-1||(nums[i]>nums[i+k]);
            if(left&&rigth){
                sum+=nums[i];
            }
        }
        return sum;
    }
}