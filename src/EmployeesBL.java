/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.EmployeeDAL;
import datos.TitleDAL;
import entidades.Employee;
import entidades.Title;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author R000R
 */
public class EmployeesBL {

    public static String insertarEmployee(
            Double codigo_emp, Date birth_date, String nombre, String apellido,
            char gender, Date hire_date) {
        String mensaje;
        if (codigo_emp > 1 && codigo_emp <= 1000000000
                && birth_date.getTime() != 0
                && nombre.trim().length() > 1 && nombre.trim().length() <= 14
                && apellido.trim().length() > 1 && apellido.trim().length() <= 16
                &&  gender!=' ' && hire_date.getTime() != 0) {
            //String totalString = String.valueOf(codigo);
            if (EmployeeDAL.buscarEmployee(codigo_emp) == null) {
                Employee employee = new Employee(codigo_emp, birth_date, nombre, apellido,gender,hire_date);
                mensaje = EmployeeDAL.insertarEmployee(employee);
                if (mensaje == null) {
                    mensaje = "Registro insertado";
                }
            } else {
                mensaje = "ERROR CODIGO ENCONTRADO";
            }
        } else {
            mensaje = "DATOS INVALIDOS";
        }
        return mensaje;
    }

    public static ArrayList<Employee> listarEmployee() {
        return EmployeeDAL.listarEmployee();
    }

    public static String buscarEmployee(Double codigo_emp) {
        if (codigo_emp > 1 && codigo_emp <= 1000000000) {
       //     String totalString = String.valueOf(codigo);
            return EmployeeDAL.buscarEmployee(codigo_emp);
        } else {
            return "Dato no válido";
        }
    }

    public static String UpdateEmployee( Double codigo_emp, Date birth_date, String nombre, String apellido,
            char gender, Date hire_date) {
        String mensaje;
        if (codigo_emp > 1 && codigo_emp <= 1000000000
                && birth_date.getTime() != 0
                && nombre.trim().length() > 1 && nombre.trim().length() <= 14
                && apellido.trim().length() > 1 && apellido.trim().length() <= 16
                &&  gender!=' ' && hire_date.getTime() != 0) {
            Employee employee = new Employee(codigo_emp, birth_date, nombre, apellido,gender,hire_date);
            mensaje = EmployeeDAL.updateEmployees(employee);
            if (mensaje == null) {
                mensaje = "Registro actualizado";
            }
        } else {
            mensaje = "Datos no válidos";
        }
        return mensaje;
    }

//    public static String eliminarEmployee(Double codigo_emp) {
//        String mensaje;
//        if (codigo_emp > 1 && codigo_emp <= 1000000000) {
//        //    String totalString = String.valueOf(codigo);
//            mensaje = EmployeeDAL.eliminarEmployee(codigo_emp);
//            if (mensaje == null) {
//                mensaje = "Registro eliminado";
//            }
//        } else {
//            mensaje = "Dato no válido";
//        }
//        return mensaje;
//    }
}
