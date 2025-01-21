package AnonymousInnerClass;

class A {
    public void show() {
        System.out.println("In A Show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() { // This is Anonymous Inner Class
            public void show() {
                System.out.println("In New Show");
            }
        };
        obj.show();
    }
}


// Anonymous Inner class

// Its a inner class which is a nested class with no name