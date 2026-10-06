class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges=new ArrayList<>();
        int start=0;
        for(int end=0;end<nums.length-1;end++){
            if(nums[end]+1!=nums[end+1]){
                if((end-start+1)>1){
                String s=nums[start]+"->"+nums[end];
                ranges.add(s);
                start=end+1;
                }else{
                    ranges.add(String.valueOf(nums[end]));
                    start=end+1;
                }
            }
        }
            if((nums.length-start)>1){
                String s=nums[start]+"->"+nums[nums.length-1];
                ranges.add(s);
            }else if((nums.length-start)==1){
                ranges.add(String.valueOf(nums[start]));
            }
        return ranges;
    }
}