import Model.CreateTable;
import Model.Insert_data;
import View.Display;

import java.sql.Connection;
import java.sql.SQLException;

class Main{
    public static void main(String[] args) throws SQLException {
        CreateTable createTable=new CreateTable();
        createTable.Create_table();
        Insert_data insertData= new Insert_data();
        insertData.Insert();
        Display display = new Display();
        display.Display();
        createTable.Create_table();
    }
}