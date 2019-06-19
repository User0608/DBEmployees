/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Title;
import java.sql.*;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author adriana
 */
public class TitleDAL {

    private static Connection conexion = null;
    private static PreparedStatement prepared_statement = null;
    private static Statement statement = null;
    private static CallableStatement callable_statemen = null;
    private static ResultSet result_set = null;

    public static String insertarTitle(Title title) {
        String mensaje = null;

        return mensaje;
    }

    public static String buscarTitle(String codigo) {
        String mensaje = null;

        return mensaje;
    }

    public static String actualizarTitle(Title title) {
        String mensaje = null;

        return mensaje;
    }

    public static ArrayList<Title> listarTitle() {
        ArrayList<Title> title = new ArrayList<Title>();
        try {
            String sql = "{call sp_listarTitles()}";
            conexion = Conexion.establishConnection();
            callable_statemen = conexion.prepareCall(sql);
            result_set = callable_statemen.executeQuery();
            while (result_set.next()) {
                title.add(
                        new Title(
                                result_set.getDouble(1), result_set.getString(2),
                                result_set.getDate(3), result_set.getDate(4))
                );
            }

        } catch (ClassNotFoundException | SQLException e) {
            showMessageDialog(null, e.getMessage(), "Error", 0);
        } finally {
            try {
                conexion.close();
                callable_statemen.close();
                result_set.close();
            } catch (SQLException e) {
                showMessageDialog(null, e.getMessage(), "Error", 0);
            }
        }
        return title;
    }

    public static String eliminarTitle(String codigo) {
        String mensaje = null;

        return mensaje;
    }
}
