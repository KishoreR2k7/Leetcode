class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            String s = String.valueOf(i);
            if((s.indexOf('3')!=-1)||(s.indexOf('4')!=-1)||(s.indexOf('7')!=-1)){
                continue;
            }
            if((s.indexOf('2')!=-1)||(s.indexOf('5')!=-1)||(s.indexOf('6')!=-1)||(s.indexOf('9')!=-1)){
                count++;
            }
        }
        return count;
    }
}