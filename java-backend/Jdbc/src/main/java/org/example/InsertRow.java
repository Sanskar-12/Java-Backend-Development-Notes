package org.example;

import java.sql.*; // --> Importing java.sql package

public class InsertRow {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/Db1";
        String uname="root";
        String pass="Sanskar@123";

        String query="insert into students values (5,'Anjali')"; // --> query for inserting the row

        Class.forName("com.mysql.cj.jdbc.Driver"); // Registering the com.mysql.cj.jdbc.Driver

        Connection con= DriverManager.getConnection(url,uname,pass); // Create a Connection to my sql

        Statement st=con.createStatement(); // Create a Statement

        int count=st.executeUpdate(query); // Execute the query

        System.out.println(count); // Count shows the number of rows affected after inserting

        // Closing the connections
        st.close();
        con.close();
    }
}
