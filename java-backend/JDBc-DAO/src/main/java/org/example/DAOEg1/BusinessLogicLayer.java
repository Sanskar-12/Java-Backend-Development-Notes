package org.example.DAOEg1;

public class BusinessLogicLayer {
    public static void main(String[] args) throws Exception {
        DatabaseInteractionLayer databaseInteractionLayer = new DatabaseInteractionLayer();
        DataVariablesStorageLayer s = databaseInteractionLayer.getStudentName(7);

        System.out.println(s.name);
    }
}

// DAO - (Data Access Object)

// In JDBC, DAO (Data Access Object) is a design pattern used to separate database interactions from business logic. It provides a structured way to interact with a database using CRUD operations.

// For eg
// Suppose i have to fetch the name of student whose roll no is 11
// So i will make a class in which i will call the method for fetching the name from roll no
// and i will make another class in which the method will be written for fetching the name from roll no in which it will contain database interaction

// so i have made a layer between database interaction and main business logic