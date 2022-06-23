package com.mycompany.empchaves.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Conexao {
// Design Pattern - Singleton

    // Fábrica de Conexões
    public static Connection fabricaDeConexoes() {

        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://10.0.0.14;databaseName=CORPORERM;user=rm;password=rm";

        try {
            Connection con = DriverManager.getConnection(connectionUrl);
            Statement stmt = con.createStatement();
            /* String SQL = "SELECT TOP 10 * FROM Person.Contact";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }*/
            return DriverManager.getConnection(connectionUrl);
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.getMessage();
        }
        return null;
    }
}

