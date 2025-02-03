class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
     Set<Integer> visited= new HashSet<>();
     dfs(0,rooms,visited);
     return visited.size()==rooms.size();   
    }
    private void dfs(int room, List<List<Integer>> rooms, Set<Integer> visited){
        if(visited.contains(room))return;
        visited.add(room);
        for(int key: rooms.get(room))
            dfs(key,rooms,visited);
        
    }
}
//note:
//0 is always unlocked
//if(visited.contains(room))return;----> If the same key appears in multiple rooms or if a room contains the same key multiple times
// dfs(key,rooms,visited);------> this is stored in a stack call hence enhances backtracking