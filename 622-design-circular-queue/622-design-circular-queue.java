class MyCircularQueue {
    int[] queue;
    int first;
    int last;
    int next;
    int capacity;
    
    public MyCircularQueue(int k) {
        next = 0;
        first = 0;
        capacity = 0;
        last = 0;
        queue = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(capacity == queue.length) {
            return false;
        }
        else {
            queue[next] = value;
            last = next;
            next = (next + 1) % queue.length;
            capacity++;
            return true;
        }    
    }
    
    public boolean deQueue() {
        if(capacity > 0) {
            queue[first] = 0;
            first = (first + 1) % queue.length;
            capacity--;
            return true;
        }
        else {
            return false;
        }
    }
    
    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        else {
            return queue[first];
        }
    }
    
    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
        else {
            return queue[last];
        }
    }
    
    public boolean isEmpty() {
        if(capacity == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean isFull() {
        if(capacity == queue.length) {
            return true;
        }
        else {
            return false;
        }
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */