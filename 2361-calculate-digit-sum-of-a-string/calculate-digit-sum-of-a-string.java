class Solution {
    public String digitSum(String s, int k) {
        String a=s;
        while(a.length()>k){
            int b=0,sum=0;
            String c="";
            for(int i=0;i<a.length();i++){
                sum+=a.charAt(i)-'0';
                b++;
                if(b==k){
                    c+=String.valueOf(sum);
                    sum=0;
                    b=0;
                }
            }
            if(b!=0){
                c+=String.valueOf(sum);
            }
            a=c;
        }
        return a;
    }
}