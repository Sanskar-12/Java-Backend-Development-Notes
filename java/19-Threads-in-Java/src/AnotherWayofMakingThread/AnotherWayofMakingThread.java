package AnotherWayofMakingThread;

//class A implements Runnable { // This is Thread
//    public void run() { // Every thread should have a method called run
//        for (int i = 1; i <= 100; i++) {
//            System.out.println("Hii");
//            try {
//                Thread.sleep(10); // Causes the thread to sleep for 10 millisecond
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//
//class B implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 100; i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

public class AnotherWayofMakingThread {
    public static void main(String[] args) {
        Runnable obj1 = () -> { // Every thread should have a method called run
            for (int i = 1; i <= 100; i++) {
                System.out.println("Hii");
                try {
                    Thread.sleep(10); // Causes the thread to sleep for 10 millisecond
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        // This is called Anonymous Class
        Runnable obj2 = () -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start(); // Start method comes from the thread class
        t2.start();
    }
}
