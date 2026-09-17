class MinStack {
    Stack <Long> st ;
    long min = 0;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {
        if(st.size() == 0){
            st.push(0l);
            min = value;
        }else{
            st.push(value - min);
            if(value - min < 0){
                min = value ;
            }
        }
    }
    
    public void pop() {
        long temp = st.pop();
        if(temp < 0){
            min = min - temp;
        }
    }
    
    public int top() {
        long temp = st.peek();
        if(temp < 0){
            return (int)min;
        }else{
            return (int)(min + temp);
        }
    }
    
    public int getMin() {
        return (int)min;
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