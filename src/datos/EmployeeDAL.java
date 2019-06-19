/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Employee;
import java.util.ArrayList;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author adriana
 */
public class EmployeeDAL {

    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement prepare_statement;
    private static CallableStatement callable_statement;
    private static ResultSet result_set;

    public static String insertEmployees(Employee employee) {
        String mensaje = null;
        String sql = "{call sp_insertEmployees(?,?,?,?,?,?)}";
        try {
            connection = Conexion.establishConnection();
            callable_statement = connection.prepareCall(sql);
            callable_statement.setInt(1, (int) employee.getEmp_no());
            callable_statement.setDate(2, employee.getBirth_date());
            callable_statement.setString(3, employee.getFirst_neme());
            callable_statement.setString(4, employee.getLast_neme());
            callable_statement.setString(5, String.valueOf(employee.getGender()));
            callable_statement.setDate(6, employee.getHire_date());

            callable_statement.executeUpdate();
            mensaje = "isok";
        } catch (ClassNotFoundException | SQLException e) {
            mensaje = e.getMessage();
        } finally {
            try {
                connection.close();
                callable_statement.close();
            } catch (SQLException e) {
                mensaje = e.getMessage();
            }
        }

        return mensaje;
    }

    public static ArrayList<Employee> listEmployes() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        String sql = "{call sp_listEmployees()}";
        try {
            connection = Conexion.establishConnection();
            callable_statement = connection.prepareCall(sql);
            result_set = callable_statement.executeQuery();
            while (result_set.next()) {
                employees.add(
                        new Employee(
                                result_set.getInt(1),
                                result_set.getDate(2),
                                result_set.getString(3),
                                result_set.getString(4),
                                result_set.getString(5).charAt(0),
                                result_set.getDate(6)
                        )
                );
            }

        } catch (ClassNotFoundException | SQLException e) {
            showMessageDialog(null, e.getMessage(), "Error", 0);
        } finally {
            try {
                connection.close();
                callable_statement.close();
                result_set.close();
            } catch (SQLException e) {
                showMessageDialog(null, e.getMessage(), "Error", 0);

            }
        }

        return employees;
    }

    public static String searchEmployeesForCode(double emp_no) {
        String mensaje = null;
        String sql = "{call sp_searchEmployeesForCode(?)}";
        try {
            connection = Conexion.establishConnection();
            callable_statement = connection.prepareCall(sql);
            callable_statement.setInt(1, (int) emp_no);
            result_set = callable_statement.executeQuery();
            while (result_set.next()) {
                mensaje = "isok";
            }
        } catch (ClassNotFoundException | SQLException e) {
            mensaje = e.getMessage();
        } finally {
            try {
                connection.close();
                callable_statement.close();
                result_set.close();
            } catch (SQLException e) {
                mensaje = e.getMessage();
            }
        }

        return mensaje;

    }

    public static String updateEmployees(Employee employee) {
        String mensaje = null;
        String sql = "{call sp_updateEmployees(?,?,?,?,?,?)}";
        try {
            connection = Conexion.establishConnection();
            callable_statement = connection.prepareCall(sql);
            callable_statement.setInt(1, (int) employee.getEmp_no());
            callable_statement.setDate(2, employee.getBirth_date());
            callable_statement.setString(3, employee.getFirst_neme());
            callable_statement.setString(4, employee.getLast_neme());
            callable_statement.setString(5, String.valueOf(employee.getGender()));
            callable_statement.setDate(6, employee.getHire_date());

            callable_statement.executeUpdate();
            mensaje = "isok";
        } catch (ClassNotFoundException | SQLException e) {
            mensaje = e.getMessage();
        } finally {
            try {
                connection.close();
                callable_statement.close();
            } catch (SQLException e) {
                mensaje = e.getMessage();
            }
        }

        return mensaje;

    }
}
