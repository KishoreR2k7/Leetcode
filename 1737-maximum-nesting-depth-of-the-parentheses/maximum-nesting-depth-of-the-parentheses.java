class Solution {
    public int maxDepth(String s) {
        int maxdepth=0,depth=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++;
            }else if(s.charAt(i)==')'){
                depth--;
            }
            maxdepth=Math.max(maxdepth,depth);
        }
        return maxdepth;
    }
}