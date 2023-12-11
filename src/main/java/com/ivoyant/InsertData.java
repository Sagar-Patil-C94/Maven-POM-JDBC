package com.ivoyant;

import java.sql.Connection;
import java.sql.Statement;

public class InsertData {
    public static int insert(Connection connection, String tableName, String columnsList, String values) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO " + tableName + columnsList + " VALUES" + values);
            return statement.getUpdateCount();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return -1;
        }
    }
}
