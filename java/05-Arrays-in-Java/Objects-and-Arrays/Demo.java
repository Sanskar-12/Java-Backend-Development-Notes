
// Making the array of the class Student
class Student {
    int rollNo;
    String name;
    String email;
}

public class Demo {
    public static void main(String[] args) {
        // Assigning value to the class variables
        Student s1 = new Student();
        s1.rollNo = 50;
        s1.name = "Sanskar";
        s1.email = "sanskar@gmail.com";

        Student s2 = new Student();
        s2.rollNo = 30;
        s2.name = "Sanchit";
        s2.email = "sanchit@gmail.com";

        Student s3 = new Student();
        s3.rollNo = 20;
        s3.name = "Aditya";
        s3.email = "aditya@gmail.com";

        // Making the array of Student class
        Student arr[] = new Student[3];

        // assigning the value of the array
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name + " : " + arr[i].email);
        }

        // String arr1[] = new String[3]; // String is also the class

    }
}
