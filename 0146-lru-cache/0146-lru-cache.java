class LRUCache {
    int cap ;
    HashMap <Integer , Node> map;
    Node head = new Node(-1 , -1);
    Node tail = new Node(-1 , -1);
    public LRUCache(int capacity) {

        map = new HashMap <>();
        cap = capacity;
        head.next = tail;
        tail.prev = head;

    }public void deletenode(Node temp){

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

    }
    public void addnode(Node temp ){
        
        Node n1 = head.next;

        head.next = temp;

        temp.prev = head;

        temp.next = n1;

        n1.prev = temp;

    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node ans = map.get(key);
            int val = ans.val;
            deletenode(ans);
            addnode(ans);
            return val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key)){
            Node ans = map.get(key);
            ans.val = value;
            deletenode(ans);
            addnode(ans);
        }else{
            if(map.size() == cap){
               map.remove(tail.prev.key);
               deletenode(tail.prev); 
            }

            Node n1 = new Node (key , value);

            map.put(key , n1);

            addnode(n1);
        }



    }class Node {
        int key ;
        int val ;
        Node next;
        Node prev;
        Node (int key , int val ){
            this.key = key;
            this.val = val;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */