package debugger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class TestClass {

    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        String jdbcdriver = "com.mysql.jdbc.Driver";
        String jdbcurl = "jdbc:mysql://127.0.0.1:8066/dbtest";
        String username = "root";
        String password = "sxli";
        Class.forName(jdbcdriver);
        Connection c = DriverManager.getConnection(jdbcurl, username, password);
        Statement st = c.createStatement();
        // 循环录入1024条数据
        for (int i = 1; i <= 1024; i++) {
            st.execute("INSERT INTO travelrecord(id,name) VALUES(" + i + ",'sxli" + i + "')");
        }
        System.out.println("OK......");
    }
}
