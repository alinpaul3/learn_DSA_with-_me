class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null||grid.length==0||grid[0].length==0) return 0;
        int maxArea=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                int area=dfs(grid,i,j);
                maxArea=Math.max(maxArea,area);}
            }
        }
        return maxArea;
    }
    public int dfs(int[][] grid,int row,int col){
        if(row<0||row>=grid.length||col<0||col>=grid[0].length||grid[row][col]==0)return 0;
        grid[row][col]=0;
        return 1+ dfs(grid,row-1,col)
        +dfs(grid,row+1,col)
        +dfs(grid,row,col-1)
        +dfs(grid,row,col+1);
    }
}