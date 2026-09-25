class Solution {
    public int[] twoSum(int[] numbers, int target) {
     int left=0,rigth=numbers.length-1;
     int[] arr=new int[2];
     while(left<rigth){
        if((numbers[left]+numbers[rigth])==target){
            arr[0]=left+1;
            arr[1]=rigth+1;
            break;
        }
        if((numbers[left]+numbers[rigth])>target){
            rigth--;
        }else{
            left++;
        }
     }   
     return arr;
    }
}