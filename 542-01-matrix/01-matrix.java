class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0)queue.offer(new int[]{i,j});
                else mat[i][j]=-1;
            }
        }
        int[][] directions={
            {-1,0},{1,0},{0,-1},{0,1}
        };
        while(!queue.isEmpty()){
            int[] current=queue.poll();
            int row=current[0];
            int col=current[1];
            for(int[] dir:directions){
                int newrow=row+dir[0];
                int newcol=col+dir[1];
                if(newrow<0||newrow>=mat.length||newcol<0||newcol>=mat[0].length||mat[newrow][newcol]!=-1)continue;
                mat[newrow][newcol]=mat[row][col]+1;
                queue.offer(new int[]{newrow,newcol});
            }
        }
        return mat;
    }
}