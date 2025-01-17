
public class Demo {
    public static void main(String[] args) {
        String name = "Sanskar";

        name = name + " Vishwakarma";

        System.out.println(name);
    }
}

// Immutability of Strings

// In heap memory we have something called String constant Pool
// in which all the Strings are stored
// if i have made a String called "Sanskar" and stored it in name variable
// then it will be stored inside the pool and then its address will be allocated
// to name variable.
// but if i append the "Vishwakarma" in the name then a new String will be
// created as "Sanskar Vishwakarma" in the pool and then its address will be
// assigned to the name variable.

// So we have practically not changed the existing string but we have created a
// new String in the pool and that address is allocated to name variable.
// thereby the Strings are immutable.
