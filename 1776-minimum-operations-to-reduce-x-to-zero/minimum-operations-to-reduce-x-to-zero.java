class Solution {
    public int minOperations(int[] nums, int x) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixsum=0;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        sum-=x;
        if(sum==0){
            return nums.length;
        }
        int max=-1;
        map.put(0, -1);
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            int required=prefixsum-sum;
            if(map.containsKey(required)){
                max=Math.max(max,(i-map.get(required)));
            }
            if (!map.containsKey(prefixsum)) {
                map.put(prefixsum, i);
            }
        }
        return max==-1?-1:nums.length-max;
    }
}