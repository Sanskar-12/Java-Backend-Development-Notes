public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        // insert at Last
        list.insert(2);
        list.insert(3);
        list.insert(4);

        // insert At Start
        list.insertAtStart(34);

        // insert at index
        list.insertAt(0,14);

        // print the linked list
        list.show();
    }
}