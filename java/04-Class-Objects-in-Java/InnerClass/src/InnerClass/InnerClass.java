package InnerClass;

class A {
    int age;

    public void show() {
        System.out.println("Show InnerClass.A");
    }

    class B { // This is inner class
        public void show() {
            System.out.println("Show B");
        }
    }

    static class C {  // We can also make inner class as static
        public void show() {
            System.out.println("Show C");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj2 = obj.new B(); // This is how we can access the inner class B
        obj2.show();

        A.C obj3 = new A.C(); // We can also directly use with the class name because it is static
        obj3.show();
    }
}

// Inner Class

// The class which is nested inside another class
// we can make the class as static if it is inner class