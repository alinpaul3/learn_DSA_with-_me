class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n=costs.length;
        long totalcost= 0;
        int leftindex=0, rightindex=n-1;

        PriorityQueue<Integer> LeftHeap= new PriorityQueue<>();
        PriorityQueue<Integer> RightHeap= new PriorityQueue<>();

        for(int i=0;i<candidates && leftindex<=rightindex;i++){
            LeftHeap.offer(costs[leftindex++]);
            if(leftindex<=rightindex){
                RightHeap.offer(costs[rightindex--]);
            }
        }
        for(int i=0;i<k;i++){
            if(RightHeap.isEmpty()||(!LeftHeap.isEmpty() && LeftHeap.peek()<=RightHeap.peek())){
            totalcost+=LeftHeap.poll();
            if(leftindex<=rightindex){
                LeftHeap.offer(costs[leftindex++]);
            }
        }else{
             totalcost+=RightHeap.poll();
            if(leftindex<=rightindex){
                RightHeap.offer(costs[rightindex--]);
        }
        }
    }
    return totalcost;
}
}

/*Operation	             Time Complexity	          Space Complexity
Initializing Heaps	        O(c log c)	                O(c)
Hiring Workers	            O(k log c)	                O(1)
Total Complexity	O((c + k) log c)- O(n log n) 	O(c) → O(n)*/