class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isLeaf;

    public TrieNode() {
        isLeaf = false;
    }
}

class Trie {
    TrieNode root;

    void insert(String key) {
        TrieNode pCrawl = root;
        for (char c : key.toCharArray()) {
            int index = c - 'a';
            if (pCrawl.children[index] == null) {
                pCrawl.children[index] = new TrieNode();
            }
            pCrawl = pCrawl.children[index];
        }
        pCrawl.isLeaf = true;
    }

    boolean isLeafNode(TrieNode root) {
        return root.isLeaf;
    }

    void display(TrieNode root, char[] str, int level) {
        if (isLeafNode(root)) {
            for (int k = level; k < str.length; k++)
                str[k] = 0;
            System.out.println(new String(str).trim());
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                str[level] = (char) (i + 'a');
                display(root.children[i], str, level + 1);
            }
        }
    }

    public static void main(String[] args) {
        String[] keys = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
        Trie trie = new Trie();
        trie.root = new TrieNode();
        for (String key : keys) {
            trie.insert(key);
        }
        int level = 0;
        char[] str = new char[20];
        System.out.println("Content of Trie:");
        trie.display(trie.root, str, level);
    }
}
