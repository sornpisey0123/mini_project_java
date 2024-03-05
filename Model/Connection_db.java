package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_db {
    public Connection connect() {
        Connection con = null;
        String url = "jdbc:postgresql://localhost:5432/account";
        String Name = "postgres";
        String pass = "1111@2222@";

        try {
            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(url, Name, pass);

            if (con.isValid(2)) {
//                System.out.println("Success Connect_database");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
