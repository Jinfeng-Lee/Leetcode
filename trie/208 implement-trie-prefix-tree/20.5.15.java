class Trie {
    private boolean is_String;//标记是否为结尾
    private Trie next[] = new Trie[26];//26个引用类型数组
    /** Initialize your data structure here. */
    public Trie() {
        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie root = this;
        char cur[] = word.toCharArray();//转换为char[]
        for(int i = 0;i<cur.length;i++){
            if(root.next[cur[i]-'a'] == null){ root.next[cur[i]-'a'] = new Trie();}//如果不存在，则先建树
            root  = root.next[cur[i]-'a'];//移至目标树
        }
        root.is_String = true;//结尾为true
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie root = this;
        char cur[] = word.toCharArray();
        for(int i = 0;i<cur.length;i++){
            if(root.next[cur[i]-'a'] == null){ return false;}
            root = root.next[cur[i]-'a'];
        }
        return root.is_String;//注意判断是否为结尾
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie root = this;
        char cur[] = prefix.toCharArray();
        for(int i = 0;i<cur.length;i++){
            if(root.next[cur[i]-'a'] == null){ return false;}
            root  = root.next[cur[i]-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
