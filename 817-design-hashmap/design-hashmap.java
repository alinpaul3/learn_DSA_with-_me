class MyHashMap {
public static final int size=1000;
private List<int[]> []map;
    public MyHashMap() {
        map=new LinkedList[size];
        for (int i = 0; i < size; i++)
        map[i]=new LinkedList<>();
    }
    private int hash(int key){
        return key%size;
    }
    public void put(int key, int value) {
        int index=hash(key);
        for(int[] pair:map[index]){
            if(pair[0]==key){
            pair[1]=value;
            return;}
        }
            map[index].add(new int[]{key,value});
    }
    public int get(int key) {
        int index=hash(key);
        for(int[] pair:map[index]){
            if(pair[0]==key){
                return pair[1];
            }
        }
        return -1;
    }
    public void remove(int key) {
        int index = hash(key);
        Iterator<int[]> it = map[index].iterator();
        while (it.hasNext()) {
        if (it.next()[0] == key) {
        it.remove();
        return;
}
}
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */