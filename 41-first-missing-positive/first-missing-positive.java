class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int num=1;
        for(int i=0;i<nums.length;i++){
            if(num<nums[i]){
                return num;
            }
            if(num==nums[i]){
                num++;
            }
        }
        return num;
    }
}