class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        UnionFind uf = new UnionFind(n);

         for(int k=0;k<n*n;k++){
            int i=k/n;
            int j=k%n; {
                if (isConnected[i][j] == 1) {
                    uf.union(i, j);
                }
            }
        }
        
        return uf.countProvinces();
    }
}

class UnionFind {
    private int[] parent;
    private int[] rank;
    private int count;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        count = n;

        for (int i = 0; i < n; i++) {
            parent[i] = i; // Initially, each node is its own parent (disjoint set)
            rank[i] = 1;   // Rank is initialized to 1
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
            count--; // Reduce number of provinces when two groups merge
        }
    }

    public int countProvinces() {
        return count;
    }
}

//Time Complexity: O(n²) (dominant term from iterating the matrix)
//Space Complexity: O(n) (extra storage for parent and rank arrays)
