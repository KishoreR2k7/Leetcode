class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left=0,rigth=arr.length-1;
        while(rigth-left+1>k){
            if(Math.abs(arr[rigth]-x)<Math.abs(x-arr[left])){
                left++;
            }else{
                rigth--;
            }
        }
        List<Integer> a=new ArrayList<>();
        for(int i=left;i<=rigth;i++){
            a.add(arr[i]);
        }
        return a;
    }
}