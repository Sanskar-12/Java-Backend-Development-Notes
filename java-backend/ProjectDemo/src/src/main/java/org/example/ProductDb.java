package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// ProductDb will do database logic
public class ProductDb {

    Connection conn = null;

    public ProductDb() {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","0000");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void save(Product p) {
        String query = "insert into product (name, type, place, warranty) values (?,?,?,?)";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, p.getName());
            st.setString(2, p.getType());
            st.setString(3, p.getPlace());
            st.setInt(4, p.getWarranty());

            st.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Product> getProducts() {
        List<Product> list = new ArrayList<>();
        String query = "select name, type, place, warranty from product";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            while(rs.next()) {
                Product p = new Product();
                p.setName(rs.getString(1));
                p.setType(rs.getString(2));
                p.setPlace(rs.getString(3));
                p.setWarranty(rs.getInt(4));

                list.add(p);
            }

            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
