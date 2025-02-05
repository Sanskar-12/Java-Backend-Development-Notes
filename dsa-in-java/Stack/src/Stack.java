public class Stack {
    int[] stack=new int[5];
    int top=0;

    // push in stack
    public void push(int data) {
        if(top==stack.length) {
            System.out.println("Stack is full");
        } else {
            stack[top]=data;
            top++;
        }
    }

    // pop in stack
    public int pop() {
        if(top==0) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            int data;
            top--;
            data=stack[top];
            stack[top]=0;
            return data;
        }
    }

    // peek in stack
    public int peek() {
        int data;
        data=stack[top-1];
        return data;
    }

    // size in stack
    public int size() {
        return top;
    }

    // isEmpty in stack
    public boolean isEmpty() {
        return top<=0;
    }

    // show stack
    public void show() {
        for(int i=0;i<stack.length;i++) {
            System.out.println(stack[i]);
        }
    }
}
