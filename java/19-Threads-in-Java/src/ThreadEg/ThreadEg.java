package ThreadEg;

class A extends Thread { // This is Thread
    public void run() { // Every thread should have a method called run
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(10); // Causes the thread to sleep for 10 millisecond
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadEg {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start(); // Start method comes from the thread class
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
    }
}

// Threads

// It's the smallest executing unit which is executed inside a program independently
// Threads are components of a process, and multiple threads can exist within the same process, sharing its resources like memory, files, and code, but executing independently.

// Characteristics of Threads

//Lightweight: Threads within the same process share resources, reducing the overhead compared to processes.
//Concurrent Execution: Multiple threads can run concurrently, improving performance, especially on multicore processors.
//Shared Resources: Threads share memory and resources, enabling efficient communication but requiring careful synchronization to avoid conflicts.