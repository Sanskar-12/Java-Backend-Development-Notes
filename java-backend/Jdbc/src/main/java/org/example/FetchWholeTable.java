package org.example;

import java.sql.*; // --> Importing java.sql package

public class FetchWholeTable {
    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/Db1";
        String uname="root";
        String pass="Sanskar@123";

        String query="select * from students"; // --> query for fetching whole table

        Class.forName("com.mysql.cj.jdbc.Driver"); // Registering the com.mysql.cj.jdbc.Driver

        Connection con= DriverManager.getConnection(url,uname,pass); // Create a Connection to my sql

        Statement st=con.createStatement(); // Create a Statement

        ResultSet rs=st.executeQuery(query); // Execute the query

        String userData="";

        // To fetch whole table
        while(rs.next()) {
            userData=rs.getInt(1) + " : " + rs.getString(2);
            System.out.println(userData);
        }


        // Closing the connections
        st.close();
        con.close();

    }
}
