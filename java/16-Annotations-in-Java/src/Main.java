class A {
    public void showTheData() {
        System.out.println("In A Show");
    }
}

class B extends A {

    @Override // Annotation
    public void showTheData() {
        System.out.println("In B Show");
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheData();
    }
}