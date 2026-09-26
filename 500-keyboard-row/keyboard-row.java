class Solution {
    public String[] findWords(String[] words) {
        List<String> s=new ArrayList<>();
        for(String a:words){
            if(isinrow(a.toLowerCase(),"qwertyuiop")||isinrow(a.toLowerCase(),"asdfghjkl")||isinrow(a.toLowerCase(),"zxcvbnm")){
                s.add(a);
            }
        }
        return s.toArray(new String[0]);
    }
    public static boolean isinrow(String s,String row){
        for(char c:s.toCharArray()){
            if(row.indexOf(c)==-1){
                return false;
            }
        }
        return true;
    }
}