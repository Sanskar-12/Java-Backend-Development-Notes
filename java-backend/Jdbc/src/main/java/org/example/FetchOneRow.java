package org.example;

import java.sql.*; // --> Importing java.sql package

public class FetchOneRow {
    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/Db1";
        String uname="root";
        String pass="Sanskar@123";

        String query="select name from students where id=3"; // --> query for fetching one row

        Class.forName("com.mysql.cj.jdbc.Driver"); // Registering the com.mysql.cj.jdbc.Driver

        Connection con=DriverManager.getConnection(url,uname,pass); // Create a Connection to my sql

        Statement st=con.createStatement(); // Create a Statement

        ResultSet rs=st.executeQuery(query); // Execute the query

        // to fetch one row
        rs.next(); // The pointer will come on the next row
        String name=rs.getString("name"); // Processing the result

        System.out.println(name);

//        String userData="";

        // To fetch whole table
//        while(rs.next()) {
//            userData=rs.getInt(1) + " : " + rs.getString(2);
//            System.out.println(userData);
//        }


        // Closing the connections
        st.close();
        con.close();

    }
}

// How to use JDBC

// 1. Import the package java.sql
// 2. Load and register ( com.mysql.cj.jdbc.Driver ) the sql connector driver ( you can either load the jar file or you can add the dependency inside pom.xml if you have maven project )
// 3. Create a Connection between java application and RDBMS
// 4. Create a statement
// 5. Execute the query
// 6. Process the result
// 7. Close the Connection