class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n>=1){
            int remainder=n%2;
            if(remainder==1){
                count++;
            }
            n/=2;
        }
        return count;
    }
}