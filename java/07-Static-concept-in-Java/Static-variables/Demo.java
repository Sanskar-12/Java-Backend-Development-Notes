
class Phone {
    String brand;
    int price;
    static String name; // This variable will be same for all the objects we create

}

public class Demo {
    public static void main(String[] args) {

        Phone ph1 = new Phone();
        ph1.brand = "Apple";
        ph1.price = 100000;
        Phone.name = "Phone";

        Phone ph2 = new Phone();
        ph2.brand = "Samsung";
        ph2.price = 100000;
        Phone.name = "Phone";

        ph1.name = "Smart Phone"; // changing the name in ph1

        System.out.println(ph2.name); // alos changed in ph2 because its a static variable

    }
}

// Static Variables

// Static variable are a common variable for all the objects
// If we change the value of the variable in one object then it will be changed
// in all other objects

// Also the static variables and static methods can be accessed with the Class
// directly without making objects