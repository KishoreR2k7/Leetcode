class Solution {
    public int incsub(int[] arr){
        int max=1;
        int count=1;
        int start=arr[0];
            for(int i=1;i<arr.length;i++){
                if(start<arr[i]){
                    start=arr[i];
                    count++;
                }else{
                    start=arr[i];
                    count=1;
                }
            max=Math.max(count,max);
        }
        return max;
    }
    public int decsub(int[] arr){
        int max=1;
            int count=1;
            int start=arr[0];
            for(int i=1;i<arr.length;i++){
                if(start>arr[i]){
                    start=arr[i];
                    count++;
                }else{
                    start=arr[i];
                    count=1;
                }
            max=Math.max(count,max);
        }
        return max;
    }
    public int longestMonotonicSubarray(int[] nums) {
        int a=incsub(nums);
        int b=decsub(nums);
        return Math.max(a,b);
    }
}