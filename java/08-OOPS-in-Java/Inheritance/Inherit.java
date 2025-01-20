
class Calc { // This is Parent Class
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class AdvCalc extends Calc { // This is Child class --> This is a single level Inheritance
    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

class ScientificCalc extends AdvCalc { // This is a Multilevel Inheritance
    public double pow(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

class BasicCalc extends Calc { // This is a Hierarchical Inheritance Because AdvCalc and BasicCalc both are
                               // child class for Calc Class
    public int mod(int n1, int n2) {
        return n1 % n2;
    }
}

public class Inherit {
    public static void main(String[] args) {
        AdvCalc calc = new AdvCalc();

        calc.add(2, 3); // Parent class had add and sub method so the child class will also have it
        calc.sub(2, 3);
        calc.mul(2, 3);
        calc.div(4, 3);

        ScientificCalc advcalc = new ScientificCalc();
        advcalc.pow(3, 2);
    }
}

// Inheritance

// Inheritance means taking the properties and methods of the parent class to
// the child class
// Its done with the extends keyword

// Now Inheritance has many types
// 1. Single Inheritance --> One class extends other the class
// 2. Multilevel Inheritance --> One class extends parent class and another
// child class extends its parent class
// 3. Hierarchical Inheritance --> Muliple Child class extends only one parent
// Class
// 4. Multiple Inheritance --> Once Child class extends Multiple Parent Class
// --> Not Supported in Java
