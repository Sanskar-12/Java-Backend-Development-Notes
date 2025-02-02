public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node=new Node();
        node.data=data;
        node.next=null;

        if(head==null) {
            head=node;
        } else {
            Node it=head;

            while(it.next!=null) {
                it=it.next;
            }

            it.next=node;
        }
    }

    public void show() {
        Node it=head;

        while(it.next!=null) {
            System.out.println(it.data);
            it=it.next;
        }

        System.out.println(it.data);
    }
}
