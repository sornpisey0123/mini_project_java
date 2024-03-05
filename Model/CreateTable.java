package Model;
import java.lang.module.Configuration;
import java.sql.*;
import java.sql.*;

public class CreateTable {
   public void Create_table(){
       Connection connection = new Connection_db().connect();
       Statement st = null;
       try{
           st = connection.createStatement();
           st.executeUpdate("CREATE TABLE IF not exists product(\n" +
                   "    id serial,\n" +
                   "    name varchar(100),\n" +
                   "    price DOUBLE PRECISION,\n" +
                   "    time timestamp DEFAULT CURRENT_TIMESTAMP\n" +
                   ");");
       }catch(SQLException ex) {
           System.out.println(ex);
       }
   }
}

