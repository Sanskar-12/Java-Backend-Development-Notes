
class A {
    public void show1() {
        System.out.println("In A Show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In B Show");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String[] args) {

        A obj=(A) new B(); // This is Upcasting
        obj.show1();

        B obj2=(B) obj; // This is Downcasting
        obj2.show2();
    }
}