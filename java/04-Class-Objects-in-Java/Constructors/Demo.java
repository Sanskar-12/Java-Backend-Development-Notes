
class Human {
    private String name;
    private int height;
    private int weight;

    public Human() { // default Constructor
        name = "Vijay";
        height = 30;
        weight = 30;
    }

    public Human(String name, int height, int weight) { // Parameterised Constructor

        System.out.println("Inside Constructor");

        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

}

public class Demo {
    public static void main(String[] args) {
        Human human = new Human("Sanskar", 30, 30); // giving default values

        System.out.println(human.getName() + " : " + human.getHeight() + " : " + human.getWeight());
    }
}

// Constructors

// look similar to Methods
// doesnt have return type
// used to assign deafault value to the variables when object is created
// We can also do constructor overloading