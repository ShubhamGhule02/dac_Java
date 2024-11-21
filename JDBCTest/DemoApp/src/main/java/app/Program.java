package app;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) throws SQLException {
        var con = DriverManager.getConnection("jdbc:mysql://dac28.local/cdac1","root","password");
        var cqstatm =con.prepareCall("{call proce2()}");


        cqstatm.execute();
        cqstatm.close();
        con.close();
    }
}