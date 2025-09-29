/*package com.sachin.Annotations.DatabaseJPA;
import java.sql.*;

public class DBConnection
{
    DBConnection()
    {
        System.out.println("DBConnection Constructor");
    }

    /*public void getConnection() throws SQLException, ClassNotFoundException
    {
        Connection conn = null;
        PreparedStatement ps = null;
        Statement stmt = null;
        ResultSet rs = null;

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
            //stmt = conn.createStatement();
            ps = conn.prepareStatement("select * from country where code like ?");
            ps.setNString(1, "G%");
            rs = ps.executeQuery();

            while (rs.next())
            {
                System.out.println("Code = " + rs.getString("Code") + ", Name = " + rs.getString("Name") + ", Continent = " + rs.getString("Continent"));
            }
        }
        catch (ClassNotFoundException | SQLException sq)
        {
            sq.printStackTrace();
        }
        finally
        {
            rs.close();
            //stmt.close();
            ps.close();
            conn.close();
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        DBConnection db = new DBConnection();
        db.getConnection();
    }
}*/
