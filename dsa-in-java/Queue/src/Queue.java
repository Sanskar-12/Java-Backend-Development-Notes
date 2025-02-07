public class Queue {
    int[] queue=new int[5];
    int front=0;
    int rear=0;
    int size=0;

    // insert in queue
    public void enqueue(int data) {
        if(!isFull()) {
            queue[rear]=data;
            rear=(rear+1)%5;
            size++;
        } else {
            System.out.println("Queue is Full");
        }
    }

    // delete from queue
    public int dequeue() {
        int data=queue[front];
        if(!isEmpty()) {
            front=(front+1)%5;
            size--;
        } else {
            System.out.println("Queue is Empty");
        }

        return data;
    }

    // get the size of the queue
    public int getSize() {
        return size;
    }

    // is Empty
    public boolean isEmpty() {
        return size==0;
    }

    // is full
    public boolean isFull() {
        return size==5;
    }

    // show the queue
    public void show() {
        for(int i=0;i<size;i++) {
            System.out.println(queue[(front+i)%5]);
        }
    }
}
