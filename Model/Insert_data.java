package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert_data {

    public void Insert() throws SQLException {
        System.out.print("Input name: ");
        String name=new Scanner(System.in).nextLine();
        System.out.print("Input Price: ");
        double price = new Scanner(System.in).nextDouble();

        Connection connection = new Connection_db().connect();

        Statement st=connection.createStatement();

        PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO product(name,price) VALUES(?,?)");
        preparedStatement.setString(1,name);
        preparedStatement.setDouble(2,price);

        preparedStatement.execute();
        System.out.print("Insert success");
    }
}
