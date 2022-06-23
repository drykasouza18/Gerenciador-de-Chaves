package com.mycompany.empchaves.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {

    private static Connection conn = null;

    public static Connection getConexao(String url, String user, String pass) throws SQLException {
        if ((conn == null) || (conn.isClosed())) {
            conn = conectar(url, user, pass);
        }
        return conn;
    }

    public static Connection conectar(String url, String user, String pass) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Properties prop = new Properties();
            prop.put("user", user);
            prop.put("password", pass);
            prop.put("charset", "UTF-8");
            prop.put("lc_ctype", "ISO8859_1");

            return DriverManager.getConnection(url, prop);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        return null;
    }
}
