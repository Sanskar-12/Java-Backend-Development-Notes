import packageA.A;

public class Access {
    public static void main(String[] args) {
        A obj=new A();

        System.out.println(obj.name); // This is another package therefore we have to make it public

        B obj1=new B();

        System.out.println(obj1.age); // its in the same package that why it is by default public
    }
}

// Access Modifiers

// 1. Public --> Available in every files and packages
// 2. Default --> Available in same class, same package non child class, same package child class
// 3. Protected --> Available in same class, same package no child class, same package child class, different package child class
// 4. Private --> Available in same class only