
public class Type {
    public static void main(String args[]) {

        // Defining some values to variables
        byte a = 127;
        int b = 23;

        // Type Casting (Explicit Conversion)
        a = (byte) b;

        // Type Conversion (Implicit Conversion)
        b = a;

        // Type Promotion
        byte b1 = 30;
        byte b2 = 10;

        int result = b1 * b2; // byte gets promoted to int

        // Lossy Conversion
        // float f = 3.5f;
        // b = (int) f;

        // System.out.println(b); // you will lose the numbers after decimal
    }
}

// When we call Type Casting and Type Conversion

// 1. Type Casting
// When we convert the type explicitly, its called Type Casting ( e.g given
// above in code )

// 2. Type Conversion
// When we convert the type implicitly or it gets converted automatically then
// its called as Type Conversion ( e.g given above in code )

// 3. Type Promotion
// When we multiply or add two values and if it goes out of range then the value
// gets promoted to upper type

// 4. Lossy Conversion
// If you convert the float value to int then you will lose the values after the
// decimal point
