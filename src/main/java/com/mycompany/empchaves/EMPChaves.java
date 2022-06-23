package com.mycompany.empchaves;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EMPChaves {

    public static void main(String[] args) {

        /* TelaInicial ti = new TelaInicial();
        ti.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ti.setVisible(true);*/
        Connection conn = null;

        try {

            String dbURL = "jdbc:sqlserver://10.0.0.14;databaseName=CORPORERM;integratedSecurity=true;";
            String user = "rm";
            String pass = "rm";
            conn = DriverManager.getConnection(dbURL, user, pass);
            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

