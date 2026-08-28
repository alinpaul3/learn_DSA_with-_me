class MyCircularDeque {

    int[] deque;
    int front;
    int rear;
    int size;
    int capacity;

    public MyCircularDeque(int k) {
        deque = new int[k];
        capacity = k;
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean insertFront(int value) {

        if (isFull())
            return false;

        if (isEmpty()) {
            deque[front] = value;
            rear = front;
        } 
        else {
            front = (front - 1 + capacity) % capacity;
            deque[front] = value;
        }

        size++;
        return true;
    }

    public boolean insertLast(int value) {

        if (isFull())
            return false;

        if (isEmpty()) {
            deque[rear] = value;
            front = rear;
        } 
        else {
            rear = (rear + 1) % capacity;
            deque[rear] = value;
        }

        size++;
        return true;
    }

    public boolean deleteFront() {

        if (isEmpty())
            return false;

        if (size == 1) {
            size = 0;
            return true;
        }

        front = (front + 1) % capacity;
        size--;

        return true;
    }

    public boolean deleteLast() {

        if (isEmpty())
            return false;

        if (size == 1) {
            size = 0;
            return true;
        }

        rear = (rear - 1 + capacity) % capacity;
        size--;

        return true;
    }

    public int getFront() {

        if (isEmpty())
            return -1;

        return deque[front];
    }

    public int getRear() {

        if (isEmpty())
            return -1;

        return deque[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
/**insertFront → front moves backward
deleteFront → front moves forward

insertLast  → rear moves forward
deleteLast  → rear moves backward */

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */