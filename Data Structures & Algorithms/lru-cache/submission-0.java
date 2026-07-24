public class Node{
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val){
        this.key = key;
        this.val = val;
        prev = null;
        next = null;
    }
}
class LRUCache {
    int cap;
    HashMap<Integer, Node> cache;
    Node left, right;

    public LRUCache(int capacity) {
        cap = capacity;
        cache = new HashMap<>();
        left = new Node(0,0);
        right = new Node(0,0);
        left.next = right;
        right.prev = left;
    }

    private void insert(Node node){
        Node prevNode = right.prev;
        prevNode.next = node;
        node.prev = prevNode;
        node.next = right;
        right.prev = node;
    }
    
    private void remove(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key))
            remove(cache.get(key));
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);
        if(cache.size()>cap){
            Node lru = left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}
