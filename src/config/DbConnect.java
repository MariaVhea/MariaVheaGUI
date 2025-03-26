package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DbConnect {
    private Connection connect;

    public DbConnect() {
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mariavhea", "root", "");
            System.out.println("Connected to database successfully!");
        } catch (SQLException ex) {
            System.out.println("Can't connect to database: " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connect;
    }

    public int insertUser(String fname, String lname, String contactnum, String email, String UserType, String reguser, String regpass) {
        int result = 0;
        String sql = "INSERT INTO users (fn, ln, cn, em, type, us, ps, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, contactnum);
            pst.setString(4, email);
            pst.setString(5, UserType);
            pst.setString(6, reguser);
            pst.setString(7, regpass);
            pst.setString(8, "Pending");

            result = pst.executeUpdate();
            System.out.println("User inserted successfully with 'Pending' status!");
        } catch (SQLException ex) {
            System.out.println("Insert Error: " + ex.getMessage());
        }
        return result;
    }

    public ResultSet getData(String query) {
        try {
            PreparedStatement pst = connect.prepareStatement(query);
            return pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Query Error: " + ex.getMessage());
            return null;
        }
     }
    //Function to update data
        public void updateData(String sql){
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                    int rowsUpdated = pst.executeUpdate();
                        if(rowsUpdated > 0){
                            JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
                        }else{
                            System.out.println("Data Update Failed!");
                        }
                        pst.close();
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
            }
        
        }

       public void insertLog(int userId, String action) {
    String query = "INSERT INTO logs (user_id, action) VALUES (?, ?)";
    try (PreparedStatement pstmt = connect.prepareStatement(query)) {
        pstmt.setInt(1, userId);
        pstmt.setString(2, action);
        pstmt.executeUpdate();
        System.out.println("Log inserted: " + action);
    } catch (SQLException ex) {
        System.out.println("Error inserting log: " + ex.getMessage());
    }
}
}


