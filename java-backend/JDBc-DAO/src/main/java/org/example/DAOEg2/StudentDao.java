package org.example.DAOEg2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDao {
    public void addStudent(int rollNo, String name)  {
        try {
            String url = "jdbc:mysql://localhost:3306/Db1";
            String uname = "root";
            String pass = "Sanskar@123";

            String query = "insert into students values (?,?)";

            // Database interaction for fetching the name with the help of roll no
            Class.forName("com.mysql.cj.jdbc.Driver"); // 2. Load and register the com.mysql.cj.jdbc.Driver class
            Connection con = DriverManager.getConnection(url,uname,pass); // 3. Make a Connection to Database
            PreparedStatement st = con.prepareStatement(query); // 4. Make a statement
            st.setInt(1,rollNo); // Replace the question mark in query with the actual value
            st.setString(2,name); // Replace the question mark in query with the actual value
            int count = st.executeUpdate(); // 5. Execute the query

            System.out.println(count + " rows affected");

            Student student = new Student();

            student.userId = rollNo;
            student.name = name;

            st.close(); // 7. Closing the connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
