public class Main {
    public static void main(String[] args) {
        Stack st=new Stack();

        // push in stack
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // peek in stack
        System.out.println(st.peek() + " is top element in stack");

        // pop in stack
        System.out.println(st.pop() + " is popped");

        // show in stack
        st.show();
    }
}