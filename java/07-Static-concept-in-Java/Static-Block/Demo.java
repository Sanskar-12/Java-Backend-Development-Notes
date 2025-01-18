
class Mobile {
    String brand;
    int price;
    static String name; // This variable will be same for all the objects we create

    // This will be called only once when the class loads
    static { // This is a Static Block
        name = "Phone";

        System.out.println("Inside Static Block");
    }

    // This Constructor will be called two times because we have created two objects
    public Mobile() { // This is a Constructor
        brand = "Apple";
        price = 3000;

        System.out.println("Inside Constructor");
    }
}

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {

        // Now to call the Class without making the object
        Class.forName("Mobile");

        // Mobile mob = new Mobile(); // 1st Object
        // mob.brand = "Apple";
        // mob.price = 3000;
        // Mobile.name = "Phone";

        // Mobile mob2 = new Mobile(); // 2nd Object
        // mob2.brand = "Samsung";
        // mob2.price = 3000;
        // Mobile.name = "Phone";
    }
}

// Constructor

// Constructor will always be called if you create the Object of a class
// It doesnt have a return type
// It looks like a method

// Static Block

// Its always called only once when the class loads
// It is to initialise the static variables in class
