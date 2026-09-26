class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder a=new StringBuilder(s);
        int startindex=-1,endindex=-1;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='('){
                startindex=i;
            }
            if(a.charAt(i)==')'&&startindex!=-1){
                endindex=i;
            }
            if(startindex!=-1&&endindex!=-1){
                String key=a.substring(startindex+1,endindex);
            if(map.containsKey(key)){
                a.replace(startindex,endindex+1,map.get(key));
            }else{
                a.replace(startindex,endindex+1,"?");
            }
                i = startindex - 1;
                startindex=-1;
                endindex=-1;
            }
        }
        return a.toString();
    }
}