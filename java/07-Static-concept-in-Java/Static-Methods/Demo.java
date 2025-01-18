
class Mobile {

    String brand;
    int price;
    static String name;

    // We can't directly use non-static variable inside the static method
    // public static void phone() {
    // System.out.println(brand + " : " + price + " : " + name );
    // }

    // to use the non static variable inside static method by passing object
    // reference
    public static void phone(Mobile obj1) {
        System.out.println(obj1.brand + " : " + obj1.price + " : " + name);
    }
}

public class Demo {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 2000;
        Mobile.name = "Phone";

        Mobile.phone(obj1);
    }
}
