package View;
import Model.Connection_db;
import Model.Insert_data;

import java.lang.module.Configuration;
import java.sql.*;
import java.sql.*;

public class Display {
        public void Display() throws SQLException {

//        String create_table="CREATE TABLE IF NOT EXISTS PRODUCT(ID INT , NAME STRING, PRICE DOUBLE)";


//        String insert_data="INSERT INTO PRODUCT(ID,NAME,PRICE)VALUES(1,'KOKA',2.00)";


//        String select="SELECT * FROM product";

            Connection connection_db=new Connection_db().connect();

                Statement st=connection_db.createStatement();

//                st.executeUpdate("CREATE TABLE IF not exists product(\n" +
//                        "    id serial,\n" +
//                        "    name varchar(100),\n" +
//                        "    price DOUBLE PRECISION,\n" +
//                        "    time timestamp DEFAULT CURRENT_TIMESTAMP\n" +
//                        ");");
//                System.out.println("Table created successfully.");

//                st.executeUpdate("INSERT INTO product(id,name,price,time)VALUES(1,'KOKA',2.00,default)");
//                System.out.println("Insert success");

//            st.executeUpdate("DELETE FROM product WHERE id=1;");
            ResultSet rs=st.executeQuery("SELECT * FROM product");

//            System.out.println(rs.getString());

                while (rs.next()){
                    int ids=rs.getInt("id");
                    String name=rs.getString("name");
                    double price=rs.getDouble("price");
                    Timestamp time=rs.getTimestamp("time");

                    System.out.println("id: "+ids+"\tname: "+ name+"\tprice: "+price+"\ttime"+time);
                }
                connection_db.close();
        }
    }
