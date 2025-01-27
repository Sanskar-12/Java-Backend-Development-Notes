package RecordClass;

// --> To Get the two values in the form of object we have to do so many things we can do it with in one line with the help of record class
//class Alien {
//    private final int id;
//    private final String name;
//
//    public Alien(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Alien alien = (Alien) o;
//        return id == alien.id && Objects.equals(name, alien.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}

// Record Class
record Alien(int id, String name) {

    public Alien() { // --> default constructor by passing the default values to parameterised constructor
        this(0, "");
    }

    public Alien(int id, String name) { // --> Parameterised Constructor - It is by default implemented in record class
        this.id = id;
        this.name = name;
    }
}

public class RecordClass {
    public static void main(String[] args) {
        Alien a1 = new Alien(1, "Sanskar");
        Alien a2 = new Alien(1, "Sanskar");
        Alien a3 = new Alien();

        System.out.println(a1.equals(a2));
        System.out.println(a1);
    }
}

// Record Class

// To access the variables in simple way and in very less number of lines of code we can use Record class
// In our normal class we have to generate the getter setter, and we have to override some methods to get our actual output
// But in Record class, they are implemented by default
// Note : In Record class you cannot create the default constructor the way we create it but we can indirectly create it by creating parameterised constructor and then creating the default one and passing the default values inside the parameterised constructor
