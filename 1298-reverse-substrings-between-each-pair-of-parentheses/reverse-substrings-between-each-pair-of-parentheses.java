class Solution {
    public String reverseParentheses(String s) {
        StringBuilder a=new StringBuilder(s);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='('){
                st.push(i);
            }
            if(!st.isEmpty()&&a.charAt(i)==')'){
                int start = st.pop();
                String reversed = new StringBuilder(
                        a.substring(start + 1, i)
                ).reverse().toString();
                a.replace(start, i + 1, reversed);
                i = start - 1;
            }
        }
        return a.toString();
    }
}