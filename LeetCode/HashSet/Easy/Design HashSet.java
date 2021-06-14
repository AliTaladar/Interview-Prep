class MyHashSet {
 
    /** Initialize your data structure here. */
    boolean[] map = new boolean[1000005];
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        map[key] = true;
    }
    
    public void remove(int key) {
        map[key] = false;
    }
    
    /** Returns true if this set did not already contain the specified element */
    public boolean contains(int key) {
        return map[key] == true;
    }
}