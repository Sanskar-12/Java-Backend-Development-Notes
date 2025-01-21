package AnonymousInnerClassWithAbstract;

abstract class A {
    public abstract void show(); // I have made it abstract so I don't have to provide the body
}

// previously we create the new class which extends the abstract class and then we provide the method body
//class B extends A {
//    public void show(){
//        System.out.println("in B Show");
//    }
//}

public class Demo {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() { // We have now define the method body in an anonymous Inner class
                System.out.println("in New Show");
            }
        };

        obj.show();
    }
}
