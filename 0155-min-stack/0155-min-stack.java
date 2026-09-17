class MinStack {
    Node head;
    public MinStack() {
        
    }
    
    public void push(int value) {
        if(head == null){
            head = new Node(value , value , null);
        }else{
            head = new Node(value , Math.min(value , head.min) , head);
        }
    }
    
    public void pop() {
         head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
    class Node{
        Node next;
        int val;
        int min;
        Node(int a , int b , Node c){
           val = a;
           min = b;
           next = c;
        }
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