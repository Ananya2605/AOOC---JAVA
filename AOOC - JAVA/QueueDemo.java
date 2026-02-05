
class QueueDemo {
    int queue[] = new int[5];
    int front = 0, rear = -1;
    void insert(int value) {
        if (rear == 4) {
            System.out.println("Queue Overflow");
        } else {
            queue[++rear] = value;
            System.out.println(value + " inserted");
        }
    }
    void delete() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front++] + " deleted");
        }
    }
    public static void main(String[] args) {
        QueueDemo q = new QueueDemo();
        q.insert(10);
        q.insert(20);
        q.insert(value: 30);
        q.delete();
    }
}