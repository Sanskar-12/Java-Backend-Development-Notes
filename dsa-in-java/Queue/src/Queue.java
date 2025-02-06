public class Queue {
    int[] queue=new int[5];
    int front=0;
    int rear=0;
    int size=0;

    // insert in queue
    public void enqueue(int data) {
        queue[rear]=data;
        rear++;
        size++;
    }

    // delete from queue
    public int dequeue() {
        int data=queue[front];
        front++;
        size--;

        return data;
    }

    // show the queue
    public void show() {
        for(int i=front;i<rear;i++) {
            System.out.println(queue[i]);
        }
    }
}
