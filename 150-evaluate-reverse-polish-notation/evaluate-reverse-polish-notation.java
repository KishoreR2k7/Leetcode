class Solution {
    public static boolean isoperator(String s){
        return s.equals("+") || s.equals("-")|| s.equals("*") || s.equals("/");  
  }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (isoperator(tokens[i])) {
                int b = st.pop();
                int a = st.pop();
                if (tokens[i].equals("+")) {
                    st.push(a + b);
                } else if (tokens[i].equals("-")) {
                    st.push(a - b);
                } else if (tokens[i].equals("*")) {
                    st.push(a * b);
                } else {
                    st.push(a / b);
                }
            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}