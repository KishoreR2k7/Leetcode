import java.util.*;
class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=(long)nums[i]*nums[i];
        }
        Arrays.sort(arr);
        int i = 0, j = nums.length - 1;
        long sum = 0;
        while (i <= j) {
            if(i==j){
                sum+=arr[j];
            }else{
                sum -= arr[i];
                sum += arr[j];
            }
                i++;
                j--;
        }
        return sum;
    }
}