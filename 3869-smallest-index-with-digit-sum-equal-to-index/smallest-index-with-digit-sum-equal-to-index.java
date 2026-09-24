class Solution {
    public int smallestIndex(int[] nums) {
      for(int i=0;i<nums.length;i++){
        int sum=0;
        int indexvalue=nums[i];
        while(indexvalue>9){
            sum+=indexvalue%10;
            indexvalue/=10;
        }  
        sum+=indexvalue;
        if(sum==i){
            return i;
        }
      }
        return -1;
    }
}