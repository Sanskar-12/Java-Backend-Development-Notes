
class Human {
    private String name;
    private int height = 30;
    private int weight = 30;

    // getter methods
    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    // setter method
    public void setName(String name) {
        this.name = name; // this refers to Human class variables only
    }

}

public class Demo {
    public static void main(String[] args) {
        Human human = new Human();

        // We cant use the variables because it is private to that class only
        // human.name = "Sanskar";
        // human.height = 20;
        // human.weight = 20;

        System.out.println("Height is " + human.getHeight());

        human.setName("Vijay");

        System.out.println("Name is " + human.getName());
    }
}

// Encapsulation in Java

// Its one of the four pillars in Java
// Encapsulation means grouping all the data, variables and methods inside one
// class or you can say capsule
// So that no other class or File can access that data or variables or methods
// without having permissions
// Its done by using private, protected and public access modifiers
// You can use those variables by getters or setters method

// Why we use Encapsulation

// To protect the data of another class
// Security of the data
// Data hiding
// Maintainability
