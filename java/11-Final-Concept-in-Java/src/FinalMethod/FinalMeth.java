package FinalMethod;

class FinalMethA {
    final public void sound() {
        System.out.println("A Sound");
    }
}

class FinalMethB extends FinalMethA {
   // public void sound() { // Method cannot be overridden because the parent method is final
     //   System.out.println("B Sound");
   // }
}

public class FinalMeth {
    public static void main(String[] args) {

    }
}

// Final Method means you cannot override the method which is final
