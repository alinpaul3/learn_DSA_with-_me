//arrange the product lexicographically into productorder
//create while loop till the whole charater is taken
    //counter<-0
    //for i to len(productorder) 
      //if(counter==3)break
      //else
    //search for prefix in productuctorder[i]


class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        List<String> suggestions = new ArrayList<>();
    }

    TrieNode root = new TrieNode();

    private void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (node.children[idx] == null)
                node.children[idx] = new TrieNode();

            node = node.children[idx];

            if (node.suggestions.size() < 3) {
                node.suggestions.add(word);
            }
        }
    }

    private List<String> search(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            int idx = ch - 'a';
            if (node.children[idx] == null)
                return new ArrayList<>();
            node = node.children[idx];
        }
        return node.suggestions;
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        for (String productorder : products) {
            insert(productorder); 
        }

        List<List<String>> result = new ArrayList<>();
        String prefix = "";
        for (char ch : searchWord.toCharArray()) {
            prefix += ch;
            result.add(search(prefix));
        }

        return result;
    }
}
