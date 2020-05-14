class Trie {
    List<String> exist;
    /** Initialize your data structure here. */
    public Trie() {
        exist = new ArrayList();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        exist.add(word);
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return exist.contains(word);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        for(int i = 0;i<exist.size();i++){
            if((exist.get(i).length()>=prefix.length()) && exist.get(i).substring(0,prefix.length()).equals(prefix)){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
 //应该是用前缀树的
