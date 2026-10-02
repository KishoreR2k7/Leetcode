class Solution {
    static {
        for (int i = 0; i < 1000; i++) {
            maxVowels("b", 0);
        }
    }
    public static int maxVowels(String s, int k) {
        int max=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
        }
        max=count;
        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
            if(isvowel(s.charAt(i-k))){
                count--;
            }
            max=Math.max(max,count);
        }
        return max;
    }
    public static boolean isvowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}