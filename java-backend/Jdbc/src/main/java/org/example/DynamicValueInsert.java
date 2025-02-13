package org.example;

import java.sql.*; // --> Importing java.sql package

public class DynamicValueInsert {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/Db1";
        String uname="root";
        String pass="Sanskar@123";

        int userId=6;
        String username="Deepali";
        String query="insert into students values (?, ?)"; // --> query for inserting the row

        Class.forName("com.mysql.cj.jdbc.Driver"); // Registering the com.mysql.cj.jdbc.Driver

        Connection con= DriverManager.getConnection(url,uname,pass); // Create a Connection to my sql

        PreparedStatement st=con.prepareStatement(query); // Create a Statement
        st.setInt(1,userId);
        st.setString(2,username);

        int count=st.executeUpdate(); // Execute the query

        System.out.println(count); // Count shows the number of rows affected after inserting

        // Closing the connections
        st.close();
        con.close();
    }
}

// Prepared Statement

// We use Prepared Statement if the values are dynamic and we don't have to use that plus and double quotes syntax