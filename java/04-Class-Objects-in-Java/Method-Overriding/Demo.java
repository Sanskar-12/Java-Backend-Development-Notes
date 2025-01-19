
class A {
    public void show() {
        System.out.println("In A Show");
    }

    public void config() {
        System.out.println("In A Config");
    }
}

class B extends A {
    public void show() { // This is Method Overriding
        System.out.println("In B Show");
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();

        obj.show();
        obj.config();
    }
}

// Method Overriding

// Suppose B Class extends A Class and i want to call the show method from B
// Class so i can make the same method name as A Class in B Class and call it

// So the Class B show method overrides the Class A show method