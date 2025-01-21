interface Computer { // This is interface
    void code();
}

class Laptop implements Computer { // If using Interface you have to write implements
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run, ...faster");
    }
}

class Developer {
    public void coder(Computer comp) {
        comp.code();
    }
}

public class InterfacesJava {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop(); // Here we are using dynamic dispatch which tells that which method to call will depend on the object creation not on object reference

        Developer dev = new Developer();
        dev.coder(desk); // if i am passing desk it will call the code of desktop because i have created the object Desktop

    }
}