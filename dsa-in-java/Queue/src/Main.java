public class Main {
    public static void main(String[] args) {
        Queue queue=new Queue();

        // insert in queue
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // delete from queue
        System.out.println(queue.dequeue() + " is Removed");

        // show the queue
        queue.show();
    }
}