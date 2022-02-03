package Udemy.Tree.Trie;

public class Trie {
    private TrieNode root;

    public Trie() {  // Time Complexity: O(1)
        root = new TrieNode();
        System.out.println("The Trie has been created successfully!!");
    }

    public void insert(String word){    // Time Complexity: O(N)
        TrieNode current= root;
        for (int i = 0; i < word.length(); i++) {
            char ch= word.charAt(i);
            TrieNode node= current.children.get(ch);
            if (node== null){
                node= new TrieNode();
                current.children.put(ch, node);
            }
            current= node;
        }
        current.endOfString= true;
        System.out.println("Successfully inserted "+word+" in Trie!!");
    }

    public boolean search(String word){ // Time Complexity: O(N)
        TrieNode current= root;
        for (int i = 0; i < word.length(); i++) {
            char ch= word.charAt(i);
            TrieNode node= current.children.get(ch);
            if (node== null){
                System.out.println("Word: "+word+" does not exist in the trie!!");
                return false;
            }
            current= node;
        }
        if (current.endOfString== true){
            System.out.println("Word: "+word+"  exist in the trie!!");
            return true;
        }
        else {
            System.out.println("Word: "+word+" does not exist in the trie. But it is prefix of another string.");
        }
        return current.endOfString;
    }

    private boolean delete(TrieNode parentNode, String word, int index){
        char ch= word.charAt(index);
        TrieNode currNode= parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;
        if (currNode.children.size()> 1){
            delete(currNode, word, index+1);
            return false;
        }
        if (index== word.length()-1){
            if (currNode.children.size()>=1){
                currNode.endOfString=false;
                return false;
            }
            else {
                parentNode.children.remove(ch);
                return true;
            }
        }
        if (currNode.endOfString== true){
            delete(currNode, word, index+1);
            return false;
        }
        canThisNodeBeDeleted= delete(currNode, word, index+1);
        if (canThisNodeBeDeleted== true){
            parentNode.children.remove(ch);
            return true;
        }
        else {
            return false;
        }
    }

    public void delete(String word){
        if (search(word)== true){
            delete(root, word, 0);
        }
    }
}
