public class LinkedList {
    Node head;

    // insert at last
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

    // insert at first
    public void insertAtStart(int data) {
        Node node=new Node();
        node.data=data;
        node.next=head;
        head=node;
    }

    // insert at index
    public void insertAt(int index,int data) {
        Node node=new Node();
        node.data=data;
        node.next=null;

        if(index==0) {
            insertAtStart(data);
        }
        else {
            Node it=head;
            for(int i=0;i<index-1;i++) {
                it=it.next;
            }

            node.next=it.next;
            it.next=node;
        }
    }

    // delete at index
    public void deleteAt(int index) {
        if(index==0) {
            head=head.next;
        } else {
            Node n=head;
            Node n1=head;

            for(int i=0;i<index-1;i++) {
                n=n.next;
            }
            n1=n.next;

            n.next=n1.next;
            n1.next=null;

//            System.out.println("n1 is to be deleted" + n1.data);
        }
    }

    // print the linked list
    public void show() {
        Node it=head;

        while(it.next!=null) {
            System.out.println(it.data);
            it=it.next;
        }

        System.out.println(it.data);
    }
}
