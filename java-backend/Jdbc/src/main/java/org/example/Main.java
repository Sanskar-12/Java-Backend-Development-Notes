package org.example;

import java.sql.*; // --> Importing java.sql package

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver"); // Registering the com.mysql.jdbc.Driver


    }
}

// How to use JDBC

// 1. Import the package java.sql
// 2. Load and register ( com.mysql.jdbc.Driver ) the sql connector driver ( you can either load the jar file or you can add the dependency inside pom.xml if you have maven project )
// 3. Create a Connection between java application and RDBMS
// 4. Create a statement
// 5. Execute the query
// 6. Process the result
// 7. Close the Connection