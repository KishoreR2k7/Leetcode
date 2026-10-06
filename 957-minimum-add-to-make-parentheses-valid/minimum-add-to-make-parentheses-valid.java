class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else if(!st.isEmpty()&&s.charAt(st.pop())=='('){
                count++;
            }
        }
        return s.length()-(2*count);
    }
}