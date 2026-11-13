class Solution {
    public int addDigits(int num) {
        while(num>9){
            int a=num;
            int sum=0;
            while(a>0){
                sum+=a%10;
                a/=10;
            }
            num=sum;
        }
        return num;
    }
}