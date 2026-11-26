class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            while (!st.isEmpty() && st.peek() > num.charAt(i) && k > 0) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }        
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        StringBuilder s = new StringBuilder();
        while (!st.isEmpty()) {
            s.append(st.pop());
        }
        s.reverse();        
        int index = 0;
        while (index < s.length() - 1 && s.charAt(index) == '0') {
            index++;
        }
        s.delete(0, index);       
        return s.length() == 0 ? "0" : s.toString();
    }
}