class Solution {
    public boolean canAliceWin(int n) {
        if(n>=10){
            n=n-10;
        }else{
            return false;
        }
        if(n<9){
            return true;
        }
        int a=9;
        while(n>=a){
            n-=a;
            a--;
        }
        return a%2==0?false:true;
    }
}