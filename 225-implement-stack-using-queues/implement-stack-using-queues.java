class MyStack {
    Queue<Integer> dq=new ArrayDeque<>();
    Queue<Integer> dq1=new ArrayDeque<>();
    public MyStack() {

    }
    
    public void push(int x) {
        dq1.add(x);
        while(!dq.isEmpty()){
            dq1.add(dq.poll());
        }
        Queue<Integer> temp = dq;
        dq = dq1;
        dq1 = temp;
    }
    
    public int pop() {
        return dq.poll();
    }
    
    public int top() {
        return dq.peek();
    }
    
    public boolean empty() {
        if(!dq.isEmpty()){
            return false;
        }
        return true;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */