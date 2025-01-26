package SealedClass;

sealed class A extends Object permits B, C { // --> You can either extends any other class to a sealed Class or you can implement also

}

final class B extends A { // --> You cannot extend any class further because its final

}

sealed class C extends A permits D { // --> You can extend but under some allowance because its sealed

}

non-sealed class D extends C { // --> Any class can extend because its non-sealed

}

class E extends D { // --> It can extend D because the D Class is non-sealed

}


public class SealedClass {
    public static void main(String[] args) {

    }
}

// Sealed Class

// If we want to allow some classes to extend the parent class and some classes to not to extend then we can use sealed Class
// If we are extending the sealed Class then we have to make the child class as final, sealed or non-sealed
// And we can also extend the sealed Class or implement the sealed Class

// final --> If you make the extended class as final then you cannot extend any class further from that class
// sealed --> If you make the extended class as sealed then you have to allow the classes which can extend that parent class
// non-sealed --> If you make the extended class as non-sealed any class can extend that parent sealed class