class LRUCache {
    class Node{
        public int key,val;
        public Node pre,next;
        Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }
    class doubleList{
        LinkedList<Node> cur;
        doubleList(){
            cur = new LinkedList();
        }
        public Node removeLast(){
            Node x = cur.get(cur.size()-1);
            cur.remove(x);
            return x;
        }
        public void addFirst(Node x){
            cur.addFirst(x);
        }
        public void remove(Node x){
            cur.remove(x);
        }
         
    }
    int capacity;
    doubleList dou;
    HashMap<Integer,Node> map;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        dou = new doubleList();
        map = new HashMap();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            int val = map.get(key).val;
            put(key,val);
            return val;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        Node x = new Node(key,value);
        if(map.containsKey(key)){
            dou.remove(map.get(key));
            dou.addFirst(x);
            map.put(key,x);
        }else{
            if(map.size() == capacity){
                Node last = dou.removeLast();
                map.remove(last.key);
            }
            map.put(key,x);
            dou.addFirst(x);
    }
}
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
