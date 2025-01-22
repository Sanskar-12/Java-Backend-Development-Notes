package MoreAboutEnums;

enum Laptop { // Laptop is a Class
    Asus(2000), // And these are the Objects
    Hp,
    Dell(500);

    // we can also create the variables
    private final int price;

    // We can also create the default Constructor
    Laptop() {
        price = 300;
    }

    // In Enum we can also create the constructor
    Laptop(int price) { // parameterised Constructor
        this.price = price;
    }

    // To get the price we can use the getter method --> So in Enums we can also create the methods
    public int getPrice() {
        return price;
    }
}

public class MoreAboutEnums {
    public static void main(String[] args) {
        Laptop l = Laptop.Hp;

        System.out.println(l.getClass().getSuperclass()); // Enum Class

        // To print single laptop and price
        System.out.println(l + " : " + l.getPrice());

        // Advanced loop to get all the laptops and their price
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}

// So enums we create it extends a superclass called Enums and we get those extra methods from Enum class
// enums we define are classes
// And in that the constants are Objects
// in Enums we can define the constructor and methods also and also variables
