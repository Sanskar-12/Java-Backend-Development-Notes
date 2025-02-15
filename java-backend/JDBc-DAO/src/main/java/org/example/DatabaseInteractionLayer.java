package org.example;

import java.sql.*; // 1. import java.sql.* package

public class DatabaseInteractionLayer {

    public DataVariablesStorageLayer getStudentName(int rollNo) throws Exception {

       try {
           String url = "jdbc:mysql://localhost:3306/Db1";
           String uname = "root";
           String pass = "Sanskar@123";

           String query = "select name from students where id=?";

           DataVariablesStorageLayer datavariablestoragelayer = new DataVariablesStorageLayer();
           datavariablestoragelayer.userId=rollNo;

           // Database interaction for fetching the name with the help of roll no
           Class.forName("com.mysql.cj.jdbc.Driver"); // 2. Load and register the com.mysql.cj.jdbc.Driver class
           Connection con = DriverManager.getConnection(url,uname,pass); // 3. Make a Connection to Database
           PreparedStatement st = con.prepareStatement(query); // 4. Make a statement
           st.setInt(1,rollNo); // Replace the question mark in query with the actual value
           ResultSet rs = st.executeQuery(); // 5. Execute the query
           rs.next(); // Go to the next row
           String name = rs.getString("name"); // 6. Process the result

           datavariablestoragelayer.name=name;

           st.close(); // 7. Closing the connection
           con.close();

           return datavariablestoragelayer;
       } catch (Exception e) {
           System.out.println(e);
       }

       return null;
    }
}
