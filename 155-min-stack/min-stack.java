class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;
    public MinStack() {
        st=new Stack<>();
        minst=new Stack<>();
        minst.push(Integer.MAX_VALUE); 
    }
    
    public void push(int value) {
        st.push(value);
        minst.push(Math.min(minst.peek(),value));
    }
    
    public void pop() {
        if(!st.isEmpty()){
        st.pop();
        minst.pop();
        }
    }
    
    public int top() {
        if(!st.isEmpty()){
        return st.peek();
        }
        return 0;
    }
    
    public int getMin() {
        if(!minst.isEmpty()){
        return minst.peek();
        }
        return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */