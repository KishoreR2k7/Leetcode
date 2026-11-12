class Solution {
    public int incsub(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int count=1;
            int start=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(start<arr[j]){
                    start=arr[j];
                    count++;
                }else{
                    break;
                }
            }
            max=Math.max(count,max);
        }
        return max;
    }
    public int decsub(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int count=1;
            int start=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(start>arr[j]){
                    start=arr[j];
                    count++;
                }else{
                    break;
                }
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