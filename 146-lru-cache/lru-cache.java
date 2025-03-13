class LRUCache {
    class Node{
        int key,value;
        Node prev, next;

        Node(int key, int value){
            this.key=key;
            this.value=value;
        }
    }
    private final int capacity;
    private final Map<Integer, Node>map;
    private final Node head, tail;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.map=new HashMap<>();
        this.head= new Node(-1,-1);
        this.tail= new Node(-1, -1);
        head.next=tail;
        tail.prev=head;
        
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
        return -1;
        Node node=map.get(key);
        moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
    if (map.containsKey(key)) {
       Node node = map.get(key);
            node.value = value;
            moveToHead(node);
        } else {
            if (map.size() == capacity) removeLRU();
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToHead(newNode);
        }
    }

    private void moveToHead(Node node){
        removeNode(node);
        addToHead(node);
    }

    private void addToHead(Node node){
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }
     
    private void removeNode(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    private void removeLRU(){
        Node lru=tail.prev;
        map.remove(lru.key);
        removeNode(lru);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */