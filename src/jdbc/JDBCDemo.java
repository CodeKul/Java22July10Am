package jdbc;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) {


        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java22july","root","melayer1");
            PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?)");
            stmt.setInt(1,4);
            stmt.setString(2,"shital");
            stmt.setString(3,"mumbai");
            stmt.executeUpdate();
            ResultSet rs=stmt.executeQuery("select * from student");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }


}

