/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author adriana
 */
public class Conexion {
    
    public static Connection establishConnection() throws ClassNotFoundException,SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/ DBEmployees";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);
    }
    
    
    public static void main(String[] args){
        try {
            Connection cn = Conexion.establishConnection();
            System.out.println("\nConexión establecida");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("\nConexión fallida: " + ex.toString());
        }
    }
}
