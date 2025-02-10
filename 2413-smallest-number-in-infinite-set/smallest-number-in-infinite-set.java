class SmallestInfiniteSet {

private PriorityQueue<Integer> minheap;
private HashSet<Integer> addedback;
private int smallest;
    public SmallestInfiniteSet() {
        minheap= new PriorityQueue<>();
        addedback= new HashSet<>();
        smallest=1;
    }
    public int popSmallest() {
        if(!minheap.isEmpty()){
            int small=minheap.poll();
            addedback.remove(small);
            return small;
        }
        return smallest++;
    }
    
    public void addBack(int num) {
        if(num<smallest && addedback.add(num)){
            minheap.offer(num);
        }
    }
}
/* Operation	       Time Complexity
  popSmallest()	    O(log N) (if heap is used) / O(1) (otherwise)
  addBack(num)	    O(log N)
 Space Complexity	O(N)

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */