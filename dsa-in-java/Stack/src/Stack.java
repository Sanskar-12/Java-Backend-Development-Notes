public class Stack {
    int[] stack=new int[5];
    int top=0;

    // push in stack
    public void push(int data) {
        stack[top]=data;
        top++;
    }

    // pop in stack
    public int pop() {
        int data;
        top--;
        data=stack[top];
        stack[top]=0;
        return data;
    }

    // peek in stack
    public int peek() {
        int data;
        data=stack[top-1];
        return data;
    }

    // show stack
    public void show() {
        for(int i=0;i<stack.length;i++) {
            System.out.println(stack[i]);
        }
    }
}
