/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Raul
 */
public class DataBase {

    public static Connection getConnection() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/fila", "SA", "");
        return c;
    }

}
