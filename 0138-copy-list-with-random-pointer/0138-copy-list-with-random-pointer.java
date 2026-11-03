class Solution {
    public Node copyRandomList(Node head) {

        if(head == null) return null;

        Node temp = head;


        while(temp != null){
            Node t = new Node(temp.val);
            Node x = temp.next;

            temp.next = t;
            t.next = x;

            temp = x;
        }

        
        Node t1 = head;

        while(t1 != null){
            Node rand = t1.random;

            t1.next.random = rand == null ? null : rand.next;

            t1 = t1.next.next;
        }


        Node ans = head.next;
        Node curr = head;

        while(curr != null){
            Node copy = curr.next;
            curr.next = copy.next;
            copy.next = (copy.next == null) ? null : copy.next.next;
            curr = curr.next;
        }

        return ans;
    }
}