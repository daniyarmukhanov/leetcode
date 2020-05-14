import java.util.HashMap;

class Trie {
    private final HashMap<Character, Trie> children;
    private boolean isLastChar;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        children = new HashMap<>();
        isLastChar = false;
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        if (word.length() == 0) {
            isLastChar = true;
            return;
        }
        Trie trie = new Trie();
        if (children.containsKey(word.charAt(0)))
            trie = children.get(word.charAt(0));
        trie.insert(word.substring(1));
        children.put(word.charAt(0), trie);
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        if (word.length() == 0)
            return isLastChar;
        if (children.containsKey(word.charAt(0)))
            return children.get(word.charAt(0)).search(word.substring(1));
        else
            return false;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        if (prefix.length() == 0)
            return true;
        if (children.containsKey(prefix.charAt(0)))
            return children.get(prefix.charAt(0)).startsWith(prefix.substring(1));
        else
            return false;
    }
}