
// Now to solve the immutability problenm of String we have StringBuffer class which is mutable
// we have StringBuilder Class also which also does the Same thing and have all the similar property as StringBuffer
// Both differs in the performance and thread safety
public class StringBuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sanskar");

        // This doesnt make new String but it replaces the existing String
        sb.append(" Vishwakarma");

        String s = sb.toString(); // Converting the StringBuffer to String

        System.out.println(sb);
    }
}
